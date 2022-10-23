
package com.PortfolioCSL.PortfolioV2.security;

import com.PortfolioCSL.PortfolioV2.model.Usuario;
import com.PortfolioCSL.PortfolioV2.security.jwt.JwtTokenUtil;
import com.PortfolioCSL.PortfolioV2.service.IUsuarioService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.security.authentication.*;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthApi {
    
    @Autowired
    private IUsuarioService usuario;
    
    @Autowired
    AuthenticationManager authManager;
    @Autowired
    JwtTokenUtil jwtTokenUtil;
    @PostMapping("/api/login")
    public ResponseEntity<?> login(@RequestBody @Valid AuthRequest request){
        try {
            Authentication authentication = authManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                                    request.getEmail(), request.getContrasenia())
            );

            Usuario user = (Usuario) authentication.getPrincipal();
            String accessToken = jwtTokenUtil.generateAccessToken(user);
            String email= user.getEmail();
            Long id = usuario.buscarPorEmail(email).getId();
            AuthResponse response = new AuthResponse(id, email, accessToken);
            
            return ResponseEntity.ok().body(response);
            
        }catch (BadCredentialsException ex){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }
}
