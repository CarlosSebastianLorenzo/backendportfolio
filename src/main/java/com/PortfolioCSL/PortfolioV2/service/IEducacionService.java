
package com.PortfolioCSL.PortfolioV2.service;

import com.PortfolioCSL.PortfolioV2.model.Educacion;
import com.PortfolioCSL.PortfolioV2.model.Usuario;
import java.util.List;

public interface IEducacionService {
            //crear o editar, leer, buscar por id, borrar
        
        public void crearEducacion(Educacion educacion);
        
        public List <Educacion>leerEducacion();
        
        public Educacion buscarEducacion(Long id);
        
        public void borrarEducacion(Long id);
        
        public List <Educacion>leerEducacionPorUsuario(Usuario usuario);
}
