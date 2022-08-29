
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
    //Usuario usuario para la ForeingKey
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String titulo;
    private String fotoPerfil;
    private String fotoPortada;
    private String info;
    
    @JoinColumn(name = "usuario_id")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JsonProperty(access = Access.WRITE_ONLY)
    private Usuario usuario;

    public AcercaDe() {
    }

    public AcercaDe(Long id, String nombre, String apellido, String titulo, String fotoPerfil, String fotoPortada, String info, Usuario usuario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.fotoPerfil = fotoPerfil;
        this.fotoPortada = fotoPortada;
        this.info = info;
        this.usuario = usuario;
    }

  
    
}
