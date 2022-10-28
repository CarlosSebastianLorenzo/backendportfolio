
package com.PortfolioCSL.PortfolioV2.controller;

import com.PortfolioCSL.PortfolioV2.model.Educacion;
import com.PortfolioCSL.PortfolioV2.service.IEducacionService;
import com.PortfolioCSL.PortfolioV2.service.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EducacionController {
  
    @Autowired
    private IEducacionService edu;
    
    @Autowired
    private IUsuarioService user;
    
    //crear o editar, leer, buscar por id, borrar
    
    @PostMapping("/crear/Educacion")
    public void crearEducacion(@RequestBody Educacion educacion){
        edu.crearEducacion(educacion);
    }
    
    @GetMapping("/api/leer/Educacion")
    @ResponseBody
    public List <Educacion>leerEducacion(){
        return edu.leerEducacion();
    }
    
    @GetMapping("{id}/leerporid/Educacion/")
    public List <Educacion>leerEducacionPorUsuario(@PathVariable Long id){
        return edu.leerEducacionPorUsuario(user.buscarUsuario(id));
    }
    
  //  @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/api/buscar/Educacion/{id}")
        public Educacion buscarEducacion(@PathVariable Long id){
            return edu.buscarEducacion(id);
        }
        
     @DeleteMapping("/borrar/Educacion/{id}")
        public void borrarEducacion(@PathVariable Long id){
            edu.borrarEducacion(id);
        }
}
