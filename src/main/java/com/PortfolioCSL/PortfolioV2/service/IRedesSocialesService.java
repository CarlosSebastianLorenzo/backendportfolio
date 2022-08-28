
package com.PortfolioCSL.PortfolioV2.service;

import com.PortfolioCSL.PortfolioV2.model.RedesSociales;
import java.util.List;

public interface IRedesSocialesService {
     //crear o editar, leer, buscar por id, borrar
        
        public void crearRedesSociales(RedesSociales eedesSociales);
        
        public List <RedesSociales>leerRedesSociales();
        
        public RedesSociales buscarRedesSociales(Long id);
        
        public void borrarRedesSociales(Long id);
}
