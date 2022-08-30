
package com.PortfolioCSL.PortfolioV2.service;

import com.PortfolioCSL.PortfolioV2.model.Educacion;
import com.PortfolioCSL.PortfolioV2.model.Usuario;
import com.PortfolioCSL.PortfolioV2.repository.IEducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService{

    @Autowired
    public IEducacionRepository edu;
    
    @Override
    public void crearEducacion(Educacion educacion) {
        edu.save(educacion);
    }

    @Override
    public List<Educacion> leerEducacion() {
        return edu.findAll();
    }

    @Override
    public Educacion buscarEducacion(Long id) {
        return edu.findById(id).orElse(null);
    }

    @Override
    public void borrarEducacion(Long id) {
         edu.deleteById(id);
    }

    @Override
    public List<Educacion> leerEducacionPorUsuario(Usuario usuario) {
        return edu.listaPorUsuarioId(usuario);
    }
    
}
