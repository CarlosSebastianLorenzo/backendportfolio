
package com.PortfolioCSL.PortfolioV2.service;

import com.PortfolioCSL.PortfolioV2.model.Experiencia;
import com.PortfolioCSL.PortfolioV2.repository.IExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{

    @Autowired
    public IExperienciaRepository exp;
    
    @Override
    public void crearExperiencia(Experiencia experiencia) {
        exp.save(experiencia);
    }

    @Override
    public List<Experiencia> leerExperiencia() {
        return exp.findAll();
    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
        return exp.findById(id).orElse(null);
    }

    @Override
    public void borrarExperiencia(Long id) {
         exp.deleteById(id);
    }
    
}
