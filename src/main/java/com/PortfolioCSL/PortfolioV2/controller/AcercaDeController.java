
package com.PortfolioCSL.PortfolioV2.controller;

import com.PortfolioCSL.PortfolioV2.model.AcercaDe;
import com.PortfolioCSL.PortfolioV2.service.IAcercaDeService;
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
public class AcercaDeController {
    
    @Autowired
    private IAcercaDeService acde;
    
    //crear o editar, leer, buscar por id, borrar
    
    @PostMapping("/crear/AcercaDe")
    public void crearAcercaDe(@RequestBody AcercaDe acercaDe){
        acde.crearAcercaDe(acercaDe);
    }
    
    @GetMapping("/api/leer/AcercaDe")
    @ResponseBody
    public List <AcercaDe>leerAcercaDe(){
        return acde.leerAcercaDe();
    }
    
    @GetMapping("/api/buscar/AcercaDe/{id}")
        public AcercaDe buscarAcercaDe(@PathVariable Long id){
            return acde.buscarAcercaDe(id);
        }
        
     @DeleteMapping("/borrar/AcercaDe/{id}")
        public void borrarAcercaDe(@PathVariable Long id){
            acde.borrarAcercaDe(id);
        }
}
