package com.PortfolioCSL.PortfolioV2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Usuario {
    //id autogenerado Long
    //usuario String
    //contrasenia String
    //email String
    //nacionalidad String
    //fechanacimiento int

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String email;
    private String contrasenia;
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    @Setter(AccessLevel.NONE)
    private Set<AcercaDe> acercade = new HashSet<>();
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    @Setter(AccessLevel.NONE)
    private Set<Educacion> educacion = new HashSet<>();
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    @Setter(AccessLevel.NONE)
    private Set<Experiencia> experiencia = new HashSet<>();
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    @Setter(AccessLevel.NONE)
    private Set<Habilidades> habilidades = new HashSet<>();
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    @Setter(AccessLevel.NONE)
    @JsonIgnore
    private Set<Proyectos> proyectos = new HashSet<>();
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    @Setter(AccessLevel.NONE)
    @JsonIgnore
    private Set<RedesSociales> redessociales = new HashSet<>();

    public Usuario() {
    }

    public Usuario(Long id, String email, String contrasenia) {
        this.id = id;
        this.email = email;
        this.contrasenia = contrasenia;
    }

    public void setAcercade(Set<AcercaDe> acercade) {
        this.acercade = acercade;
        for (AcercaDe variablelocal : acercade) {
            variablelocal.setUsuario(this);
        }
    }

    public void setEducacion(Set<Educacion> educacion) {
        this.educacion = educacion;
        for (Educacion variablelocal : educacion) {
            variablelocal.setUsuario(this);
        }
    }

    public void setExperiencia(Set<Experiencia> experiencia) {
        this.experiencia = experiencia;
        for (Experiencia variablelocal : experiencia) {
            variablelocal.setUsuario(this);
        }
    }

    public void setHabilidades(Set<Habilidades> habilidades) {
        this.habilidades = habilidades;
        for (Habilidades variablelocal : habilidades) {
            variablelocal.setUsuario(this);
        }
    }

    public void setProyectos(Set<Proyectos> proyectos) {
        this.proyectos = proyectos;
        for (Proyectos variablelocal : proyectos) {
            variablelocal.setUsuario(this);
        }
    }

    public void setRedessociales(Set<RedesSociales> redessociales) {
        this.redessociales = redessociales;
        for (RedesSociales variablelocal : redessociales) {
            variablelocal.setUsuario(this);
        }
    }

}
