
package com.PortfolioCSL.PortfolioV2.service;

import com.PortfolioCSL.PortfolioV2.model.AcercaDe;
import com.PortfolioCSL.PortfolioV2.repository.IAcercaDeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcercaDeService implements IAcercaDeService{

    @Autowired
    public IAcercaDeRepository acde;
    
       
    @Override
    public void crearAcercaDe(AcercaDe acercaDe) {
        acde.save(acercaDe);
    }

    @Override
    public List<AcercaDe> leerAcercaDe() {
        return acde.findAll();
    }

    @Override
    public AcercaDe buscarAcercaDe(Long id) {
        return acde.findById(id).orElse(null);
    }

    @Override
    public void borrarAcercaDe(Long id) {
         acde.deleteById(id);
    }
    
}
