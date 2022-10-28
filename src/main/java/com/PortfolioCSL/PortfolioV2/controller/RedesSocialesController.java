
package com.PortfolioCSL.PortfolioV2.controller;

import com.PortfolioCSL.PortfolioV2.model.RedesSociales;
import com.PortfolioCSL.PortfolioV2.service.IRedesSocialesService;
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
public class RedesSocialesController {
  
    @Autowired
    private IRedesSocialesService rrss;
    
    //crear o editar, leer, buscar por id, borrar
    
    @PostMapping("/crear/RedesSociales")
    public void crearRedesSociales(@RequestBody RedesSociales redesSociales){
        rrss.crearRedesSociales(redesSociales);
    }
    
    @GetMapping("/api/leer/RedesSociales")
    @ResponseBody
    public List <RedesSociales>leerRedesSociales(){
        return rrss.leerRedesSociales();
    }
    
    @GetMapping("/api/buscar/RedesSociales/{id}")
        public RedesSociales buscarRedesSociales(@PathVariable Long id){
            return rrss.buscarRedesSociales(id);
        }
        
     @DeleteMapping("/borrar/RedesSociales/{id}")
        public void borrarRedesSociales(@PathVariable Long id){
            rrss.borrarRedesSociales(id);
        }
}
