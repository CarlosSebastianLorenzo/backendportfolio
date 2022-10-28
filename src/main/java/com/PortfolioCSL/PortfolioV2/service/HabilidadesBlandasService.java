
package com.PortfolioCSL.PortfolioV2.service;

import com.PortfolioCSL.PortfolioV2.model.HabilidadesBlandas;
import com.PortfolioCSL.PortfolioV2.repository.IHabilidadesBlandasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadesBlandasService implements IHabilidadesBlandasService {
    
    @Autowired
    public IHabilidadesBlandasRepository hab;

    @Override
    public void crearHabilidadesBlandas(HabilidadesBlandas habilidadesBlandas) {
        hab.save(habilidadesBlandas);
    }

    @Override
    public List<HabilidadesBlandas> leerHabilidadesBlandas() {
        return hab.findAll();
    }

    @Override
    public HabilidadesBlandas buscarHabilidadesBlandas(Long id) {
        return hab.findById(id).orElse(null);
    }

    @Override
    public void borrarHabilidadesBlandas(Long id) {
        hab.deleteById(id);
    }
    
}
