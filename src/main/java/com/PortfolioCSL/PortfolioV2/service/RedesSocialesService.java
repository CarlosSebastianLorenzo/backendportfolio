
package com.PortfolioCSL.PortfolioV2.service;

import com.PortfolioCSL.PortfolioV2.model.RedesSociales;
import com.PortfolioCSL.PortfolioV2.repository.IRedesSocialesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedesSocialesService implements IRedesSocialesService {

    @Autowired
    public IRedesSocialesRepository rrss;
    
    @Override
    public void crearRedesSociales(RedesSociales redesSociales) {
        rrss.save(redesSociales);
    }

    @Override
    public List<RedesSociales> leerRedesSociales() {
        return rrss.findAll();
    }

    @Override
    public RedesSociales buscarRedesSociales(Long id) {
        return rrss.findById(id).orElse(null);
    }

    @Override
    public void borrarRedesSociales(Long id) {
         rrss.deleteById(id);
    }
    
}
