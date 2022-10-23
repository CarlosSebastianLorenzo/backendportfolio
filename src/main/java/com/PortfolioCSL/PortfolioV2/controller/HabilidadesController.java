
package com.PortfolioCSL.PortfolioV2.controller;

import com.PortfolioCSL.PortfolioV2.model.Habilidades;
import com.PortfolioCSL.PortfolioV2.service.IHabilidadesService;
import com.PortfolioCSL.PortfolioV2.service.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HabilidadesController {
  
    @Autowired
    private IHabilidadesService hab;
    
      @Autowired
    private IUsuarioService user;
    
    //crear o editar, leer, buscar por id, borrar
    
    @PostMapping("/crear/Habilidades")
    public void crearHabilidades(@RequestBody Habilidades habilidades){
        hab.crearHabilidades(habilidades);
    }
    
    @GetMapping("/api/leer/Habilidades")
    @ResponseBody
    public List <Habilidades>leerHabilidades(){
        return hab.leerHabilidades();
    }
    
        @GetMapping("/api/portfolio/{id}/leerporid/Habilidades/")
    public List <Habilidades>leerEducacionPorUsuario(@PathVariable Long id){
        return hab.leerHabilidadesPorUsuario(user.buscarUsuario(id));
    }
    
    @GetMapping("/api/buscar/Habilidades/{id}")
        public Habilidades buscarHabilidades(@PathVariable Long id){
            return hab.buscarHabilidades(id);
        }
        
//      @CrossOrigin(origins = "*")
     @DeleteMapping("/borrar/Habilidades/{id}")
        public void borrarHabilidades(@PathVariable Long id){
            hab.borrarHabilidades(id);
        }
}
