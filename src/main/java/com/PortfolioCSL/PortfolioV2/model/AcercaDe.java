
package com.PortfolioCSL.PortfolioV2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class AcercaDe {
    //id autogenerado Long
     //nombre String
    //apellido String
    //titulo String
    //fotoPerfil String
    //fotoPortada String
    //info String
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String titulo;
    private String fotoPerfil;
    private String fotoPortada;
    private String info;

    public AcercaDe() {
    }

    public AcercaDe(Long id, String nombre, String apellido, String titulo, String fotoPerfil, String fotoPortada, String info) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.fotoPerfil = fotoPerfil;
        this.fotoPortada = fotoPortada;
        this.info = info;
    }
    
}
