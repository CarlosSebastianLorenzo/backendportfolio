
package com.PortfolioCSL.PortfolioV2.controller;

import com.PortfolioCSL.PortfolioV2.model.Usuario;
import com.PortfolioCSL.PortfolioV2.service.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UsuarioController {
  
    @Autowired
    private IUsuarioService user;
    
    //crear o editar, leer, buscar por id, borrar
    
    @PostMapping("/crear/Usuario")
    public String crearUsuario(@RequestBody Usuario usuario){
        String email = usuario.getEmail();
        if (user.buscarPorEmail(email)==null){
        user.crearUsuario(usuario);
        return "el usuario fue creado correctamente";
        }
        else {
        return "el email ya se encuentra registrado";
        }
    }
    
        @PostMapping("/buscar/Usuario")
    public Long buscarPorEmail(@RequestBody Usuario usuario){
        String email = usuario.getEmail();
        return user.buscarPorEmail(email).getId();
    }
    
    @GetMapping("/leer/Usuario")
    @ResponseBody
    public List <Usuario>leerUsuario(){
        return user.leerUsuario();
    }
    
    @GetMapping("/portfolio/{id}")
        public Usuario buscarUsuario(@PathVariable Long id){
            return user.buscarUsuario(id);
        }
        
     @DeleteMapping("/borrar/Usuario/{id}")
        public void borrarUsuario(@PathVariable Long id){
            user.borrarUsuario(id);
        }
        
        @GetMapping("/login/{email}")
        public List <Usuario>buscarEmail (@PathVariable String email){
            return user.buscarEmail(email);
        }
}
