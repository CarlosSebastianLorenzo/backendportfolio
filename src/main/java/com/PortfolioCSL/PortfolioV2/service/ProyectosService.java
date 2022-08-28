
package com.PortfolioCSL.PortfolioV2.service;

import com.PortfolioCSL.PortfolioV2.model.Proyectos;
import com.PortfolioCSL.PortfolioV2.repository.IProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements IProyectosService{

    @Autowired
    public IProyectosRepository proy;
    
    @Override
    public void crearProyectos(Proyectos proyectos) {
        proy.save(proyectos);
    }

    @Override
    public List<Proyectos> leerProyectos() {
        return proy.findAll();
    }

    @Override
    public Proyectos buscarProyectos(Long id) {
        return proy.findById(id).orElse(null);
    }

    @Override
    public void borrarProyectos(Long id) {
         proy.deleteById(id);
    }
    
}
