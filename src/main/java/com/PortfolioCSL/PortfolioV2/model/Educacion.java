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

@Getter @Setter
@Entity
public class Educacion {
    //id Long
    //Institucion String
    //logoInstitucion String
    //Titulo String
    //fechaInicio Int
    //fechaFinal Int
   //Usuario usuario para la ForeingKey
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String institucion;
    @Size(max=500)
    private String logo;
    private String titulo;
    @Temporal(TemporalType.DATE )
    private Date fechaInicial;
    @Temporal(TemporalType.DATE)
    private Date fechaFinal;
    
   @JoinColumn(name = "usuario_id")
   @ManyToOne(fetch = FetchType.LAZY,optional = false)
   @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
   private Usuario usuario;

    public Educacion() {
    }

    public Educacion(Long id, String institucion, String logo, String titulo, Date fechaInicial, Date fechaFinal, Usuario usuario) {
        this.id = id;
        this.institucion = institucion;
        this.logo = logo;
        this.titulo = titulo;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.usuario = usuario;
    }

 }
