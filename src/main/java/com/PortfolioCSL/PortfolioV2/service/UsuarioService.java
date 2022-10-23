
package com.PortfolioCSL.PortfolioV2.service;

import com.PortfolioCSL.PortfolioV2.model.Usuario;
import com.PortfolioCSL.PortfolioV2.repository.IUsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    public IUsuarioRepository user;
    
    @Override
    public void crearUsuario(Usuario usuario) {
         PasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
        String email=usuario.getEmail();
        String rawPassword=usuario.getContrasenia();
        String encodePassword=passwordEncoder.encode(rawPassword);
        Usuario newUser=new Usuario(email, encodePassword);
        user.save(newUser);
    }

    @Override
    public List<Usuario> leerUsuario() {
        return user.findAll();
    }

    @Override
    public Usuario buscarUsuario(Long id) {
        return user.findById(id).orElse(null);
    }

    @Override
    public void borrarUsuario(Long id) {
         user.deleteById(id);
    }
    
    @Override
    public List<Usuario> buscarEmail(String email) {
         return user.listaPorEmail(email);
    }

       public Usuario buscarPorEmail(String email) {
        return user.findByEmail(email).orElse(null);
       }
}
