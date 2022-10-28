
package com.PortfolioCSL.PortfolioV2.controller;

import com.PortfolioCSL.PortfolioV2.model.HabilidadesBlandas;
import com.PortfolioCSL.PortfolioV2.service.IHabilidadesBlandasService;
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
public class HabilidadesBlandasController {
    
    @Autowired
    private IHabilidadesBlandasService hab;
    
    @PostMapping("/crear/HabilidadesBlandas")
    public void crearHabilidadesBlandas(@RequestBody HabilidadesBlandas habilidadesBlandas){
        hab.crearHabilidadesBlandas(habilidadesBlandas);
    }
    
    @GetMapping("/api/leer/HabilidadesBlandas")
    @ResponseBody
    public List <HabilidadesBlandas>leerHabilidadesBlandas(){
        return hab.leerHabilidadesBlandas();
    }
    
    @GetMapping("/api/buscar/HabilidadesBlandas/{id}")
        public HabilidadesBlandas buscarHabilidadesBlandas(@PathVariable Long id){
            return hab.buscarHabilidadesBlandas(id);
        }
        
     @DeleteMapping("/borrar/HabilidadesBlandas/{id}")
        public void borrarHabilidadesBlandas(@PathVariable Long id){
            hab.borrarHabilidadesBlandas(id);
        }
    
}
