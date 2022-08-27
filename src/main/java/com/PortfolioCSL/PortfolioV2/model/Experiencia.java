
package com.PortfolioCSL.PortfolioV2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    //id Autogenerado Long
    //empresa String
    //puesto String
    //fechaInicio int
    //fechaFinal int
    //logoDeLaEmpresa String
    //actividadesRealizadas String
    
     @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String empresa;
    private String puesto;
    private int fechaInicio;
    private int fechaFinal;
    private String logo;
    private String actividades;

    public Experiencia() {
    }

    public Experiencia(Long id, String empresa, String puesto, int fechaInicio, int fechaFinal, String logo, String actividades) {
        this.id = id;
        this.empresa = empresa;
        this.puesto = puesto;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.logo = logo;
        this.actividades = actividades;
    }
    
}
