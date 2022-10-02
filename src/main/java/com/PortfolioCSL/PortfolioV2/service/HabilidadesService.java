
package com.PortfolioCSL.PortfolioV2.service;

import com.PortfolioCSL.PortfolioV2.model.Habilidades;
import com.PortfolioCSL.PortfolioV2.model.Usuario;
import com.PortfolioCSL.PortfolioV2.repository.IHabilidadesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadesService implements IHabilidadesService{

    @Autowired
    public IHabilidadesRepository hab;
    
    @Override
    public void crearHabilidades(Habilidades habilidades) {
        hab.save(habilidades);
    }

    @Override
    public List<Habilidades> leerHabilidades() {
        return hab.findAll();
    }

    @Override
    public Habilidades buscarHabilidades(Long id) {
        return hab.findById(id).orElse(null);
    }

    @Override
    public void borrarHabilidades(Long id) {
         hab.deleteById(id);
    }

    @Override
    public List<Habilidades> leerHabilidadesPorUsuario(Usuario usuario) {
        return hab.listaPorUsuarioId(usuario);
    }
    
}

