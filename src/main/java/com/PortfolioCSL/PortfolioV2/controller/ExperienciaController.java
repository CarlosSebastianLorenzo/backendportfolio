
package com.PortfolioCSL.PortfolioV2.controller;

import com.PortfolioCSL.PortfolioV2.model.Experiencia;
import com.PortfolioCSL.PortfolioV2.service.IExperienciaService;
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
public class ExperienciaController {
  
    @Autowired
    private IExperienciaService exp;
    
    //crear o editar, leer, buscar por id, borrar
    
    @PostMapping("/crear/Experiencia")
    public void crearExperiencia(@RequestBody Experiencia experiencia){
        exp.crearExperiencia(experiencia);
    }
    
    @GetMapping("/api/leer/Experiencia")
    @ResponseBody
    public List <Experiencia>leerExperiencia(){
        return exp.leerExperiencia();
    }
    
    @GetMapping("/api/buscar/Experiencia/{id}")
        public Experiencia buscarExperiencia(@PathVariable Long id){
            return exp.buscarExperiencia(id);
        }
        
     @DeleteMapping("/borrar/Experiencia/{id}")
        public void borrarExperiencia(@PathVariable Long id){
            exp.borrarExperiencia(id);
        }
}
