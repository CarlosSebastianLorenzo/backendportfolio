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
public class Experiencia {
    //id Autogenerado Long
    //empresa String
    //puesto String
    //fechaInicio int
    //fechaFinal int
    //logoDeLaEmpresa String
    //actividadesRealizadas String
    //Usuario usuario para la ForeingKey

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String empresa;
    private String puesto;
    @Temporal(TemporalType.DATE )
    private Date fechaInicio;
    @Temporal(TemporalType.DATE )
    private Date fechaFinal;
    @Size(max=500)
    private String logo;
    @Size(max=500)
    private String actividades;

    @JoinColumn(name = "usuario_id")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Usuario usuario;

    public Experiencia() {
    }

    public Experiencia(Long id, String empresa, String puesto, Date fechaInicio, Date fechaFinal, String logo, String actividades, Usuario usuario) {
        this.id = id;
        this.empresa = empresa;
        this.puesto = puesto;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.logo = logo;
        this.actividades = actividades;
        this.usuario = usuario;
    }

}
