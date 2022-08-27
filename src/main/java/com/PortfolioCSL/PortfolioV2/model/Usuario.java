package com.PortfolioCSL.PortfolioV2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Usuario {
    //id autogenerado Long
    //usuario String
    //contrasenia String
    //email String
    //nacionalidad String
    //fechanacimiento int
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String usuario;
    private String contrasenia;
    private String email;
    private String nacionalidad;
    private int fechaNacimiento;

    public Usuario() {
    }

    public Usuario(Long id, String usuario, String contrasenia, String email, String nacionalidad, int fechaNacimiento) {
        this.id = id;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.email = email;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
    }
    
 }
