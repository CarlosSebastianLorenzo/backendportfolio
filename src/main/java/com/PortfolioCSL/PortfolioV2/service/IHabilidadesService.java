
package com.PortfolioCSL.PortfolioV2.service;

import com.PortfolioCSL.PortfolioV2.model.Habilidades;
import com.PortfolioCSL.PortfolioV2.model.Usuario;
import java.util.List;

public interface IHabilidadesService {
     //crear o editar, leer, buscar por id, borrar
        
        public void crearHabilidades(Habilidades habilidades);
        
        public List <Habilidades>leerHabilidades();
        
        public Habilidades buscarHabilidades(Long id);
        
        public void borrarHabilidades(Long id);
        
         public List <Habilidades>leerHabilidadesPorUsuario(Usuario usuario);
}
