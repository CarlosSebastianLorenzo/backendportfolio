
package com.PortfolioCSL.PortfolioV2.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class AcercaDe {
    //id autogenerado Long
     //nombre String
    //color String
    //titulo String
    //fotoPerfil String
    //fotoPortada String
    //info String
    //Usuario usuario para la ForeingKey
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String color;
    private String titulo;
    @Size(max=500)
    private String fotoPerfil;
    @Size(max=500)
    private String fotoPortada;
    @Size(max=500)
    private String info;
    
    @JoinColumn(name = "usuario_id")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JsonProperty(access = Access.WRITE_ONLY)
    private Usuario usuario;

    public AcercaDe() {
    }

    public AcercaDe(Long id, String nombre, String color, String titulo, String fotoPerfil, String fotoPortada, String info, Usuario usuario) {
        this.id = id;
        this.nombre = nombre;
        this.color = color;
        this.titulo = titulo;
        this.fotoPerfil = fotoPerfil;
        this.fotoPortada = fotoPortada;
        this.info = info;
        this.usuario = usuario;
    }
   
}
