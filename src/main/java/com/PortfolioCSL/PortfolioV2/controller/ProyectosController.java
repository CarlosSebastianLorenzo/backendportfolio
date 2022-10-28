
package com.PortfolioCSL.PortfolioV2.controller;

import com.PortfolioCSL.PortfolioV2.model.Proyectos;
import com.PortfolioCSL.PortfolioV2.service.IProyectosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProyectosController {
  
    @Autowired
    private IProyectosService proy;
    
    //crear o editar, leer, buscar por id, borrar
    
    @PostMapping("/crear/Proyectos")
    public void crearProyectos(@RequestBody Proyectos proyectos){
        proy.crearProyectos(proyectos);
    }
    
    @GetMapping("/api/leer/Proyectos")
    @ResponseBody
    public List <Proyectos>leerProyectos(){
        return proy.leerProyectos();
    }
    
    @GetMapping("/api/buscar/Proyectos/{id}")
        public Proyectos buscarProyectos(@PathVariable Long id){
            return proy.buscarProyectos(id);
        }
        
     @DeleteMapping("/borrar/Proyectos/{id}")
        public void borrarProyectos(@PathVariable Long id){
            proy.borrarProyectos(id);
        }
}
