package com.PortfolioCSL.PortfolioV2.model;

import com.fasterxml.jackson.annotation.JsonProperty;
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

@Getter
@Setter
@Entity
public class Habilidades {
    //Id Long
    //Nombre String
    //Imagen String
    //Porcentaje int
    //Usuario usuario para la ForeingKey

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    @Size(max=500)
    private String imagen;
    private int porcentaje;

    @JoinColumn(name = "usuario_id")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Usuario usuario;

    public Habilidades() {
    }

    public Habilidades(Long id, String nombre, String imagen, int porcentaje, Usuario usuario) {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
        this.porcentaje = porcentaje;
        this.usuario = usuario;
    }

}
