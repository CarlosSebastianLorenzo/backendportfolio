
package com.PortfolioCSL.PortfolioV2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Habilidades {
    //Id Long
    //Nombre String
    //Imagen String
    //Porcentaje int
    
     @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String imagen;
    private int porcentaje;

    public Habilidades() {
    }

    public Habilidades(Long id, String nombre, String imagen, int porcentaje) {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
        this.porcentaje = porcentaje;
    }
    
}
