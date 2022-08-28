
package com.PortfolioCSL.PortfolioV2.service;

import com.PortfolioCSL.PortfolioV2.model.AcercaDe;
import java.util.List;

public interface IAcercaDeService {
        //crear o editar, leer, buscar por id, borrar
        
        public void crearAcercaDe(AcercaDe acercaDe);
        
        public List <AcercaDe>leerAcercaDe();
        
        public AcercaDe buscarAcercaDe(Long id);
        
        public void borrarAcercaDe(Long id);
}
