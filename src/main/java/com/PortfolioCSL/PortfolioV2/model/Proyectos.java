
package com.PortfolioCSL.PortfolioV2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyectos {
    //id Long    
    //nombre String
    //fecha String
    //descripcion String
    //link String
    //Imagen String
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String fecha;
    private String descripcion;
    private String link;
    private String imagen;
    
}
