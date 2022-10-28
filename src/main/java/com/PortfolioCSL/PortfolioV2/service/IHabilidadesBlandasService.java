
package com.PortfolioCSL.PortfolioV2.service;

import com.PortfolioCSL.PortfolioV2.model.HabilidadesBlandas;
import java.util.List;

public interface IHabilidadesBlandasService {
    
         public void crearHabilidadesBlandas(HabilidadesBlandas habilidadesBlandas);
        
        public List <HabilidadesBlandas>leerHabilidadesBlandas();
        
        public HabilidadesBlandas buscarHabilidadesBlandas(Long id);
        
        public void borrarHabilidadesBlandas(Long id);
}
