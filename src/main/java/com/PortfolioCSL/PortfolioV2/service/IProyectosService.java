
package com.PortfolioCSL.PortfolioV2.service;

import com.PortfolioCSL.PortfolioV2.model.Proyectos;
import java.util.List;

public interface IProyectosService {
     //crear o editar, leer, buscar por id, borrar
        
        public void crearProyectos(Proyectos proyectos);
        
        public List <Proyectos>leerProyectos();
        
        public Proyectos buscarProyectos(Long id);
        
        public void borrarProyectos(Long id);
}
