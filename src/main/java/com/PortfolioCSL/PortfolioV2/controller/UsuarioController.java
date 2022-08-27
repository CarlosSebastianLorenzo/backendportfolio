
package com.PortfolioCSL.PortfolioV2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    @GetMapping("/enviar")
    public String decirHola(){
        return "Hola mundo";
		}	

}
