
package com.PortfolioCSL.PortfolioV2.service;

import com.PortfolioCSL.PortfolioV2.model.Experiencia;
import java.util.List;

public interface IExperienciaService {
            //crear o editar, leer, buscar por id, borrar
        
        public void crearExperiencia(Experiencia experiencia);
        
        public List <Experiencia>leerExperiencia();
        
        public Experiencia buscarExperiencia(Long id);
        
        public void borrarExperiencia(Long id);
}
