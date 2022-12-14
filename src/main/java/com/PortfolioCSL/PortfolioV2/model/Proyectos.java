
package com.PortfolioCSL.PortfolioV2.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Proyectos {
    //id Long    
    //nombre String
    //fecha String
    //descripcion String
    //link String
    //Imagen String
    //Usuario usuario para la ForeingKey

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Size(max=500)
    private String descripcion;
    @Size(max=500)
    private String link;
    @Size(max=500)
    private String imagen;

    @JoinColumn(name = "usuario_id")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Usuario usuario;

    public Proyectos() {
    }

    public Proyectos(Long id, String nombre, Date fecha, String descripcion, String link, String imagen, Usuario usuario) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.link = link;
        this.imagen = imagen;
        this.usuario = usuario;
    }

}
