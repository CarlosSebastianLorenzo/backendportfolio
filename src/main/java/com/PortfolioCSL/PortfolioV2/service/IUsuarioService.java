
package com.PortfolioCSL.PortfolioV2.service;

import com.PortfolioCSL.PortfolioV2.model.Usuario;
import java.util.List;

public interface IUsuarioService {
     //crear o editar, leer, buscar por id, borrar
        
        public void crearUsuario(Usuario usuario);
        
        public List <Usuario>leerUsuario();
        
        public Usuario buscarUsuario(Long id);
        
        public void borrarUsuario(Long id);
        
        public List <Usuario>buscarEmail(String email);
        
        public Usuario buscarPorEmail(String email);
}
