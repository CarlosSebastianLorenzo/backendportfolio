package com.PortfolioCSL.PortfolioV2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    //id Long
    //Institucion String
    //logoInstitucion String
    //Titulo String
    //fechaInicio Int
    //fechaFinal Int
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String institucion;
    private String logo;
    private String titulo;
    private String fechaInicial;
    private String fechaFinal;

    public Educacion() {
    }

    public Educacion(Long id, String institucion, String logo, String titulo, String fechaInicial, String fechaFinal) {
        this.id = id;
        this.institucion = institucion;
        this.logo = logo;
        this.titulo = titulo;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
    }
    
}
