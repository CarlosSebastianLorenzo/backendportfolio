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
public class RedesSociales {
    //id Autogenerado Long
    //logo String
    //link String
    //nombre String

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Size(max=500)
    private String logo;
    @Size(max=500)
    private String link;
    private String nombre;

    @JoinColumn(name = "usuario_id")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Usuario usuario;

    public RedesSociales() {
    }

    public RedesSociales(Long id, String logo, String link, String nombre, Usuario usuario) {
        this.id = id;
        this.logo = logo;
        this.link = link;
        this.nombre = nombre;
        this.usuario = usuario;
    }

}
