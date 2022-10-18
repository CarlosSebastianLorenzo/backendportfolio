
package com.PortfolioCSL.PortfolioV2.security;

import com.PortfolioCSL.PortfolioV2.model.Usuario;
import com.PortfolioCSL.PortfolioV2.security.jwt.JwtTokenUtil;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.security.authentication.*;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthApi {
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
            AuthResponse response = new AuthResponse(user.getEmail(), accessToken);
            
            return ResponseEntity.ok().body(response);
            
        }catch (BadCredentialsException ex){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }
}
