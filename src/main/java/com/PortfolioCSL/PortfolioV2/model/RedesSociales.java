
package com.PortfolioCSL.PortfolioV2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class RedesSociales {
    //id Autogenerado Long
    //logo String
    //link String
    //nombre String
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String logo;
    private String link;
    private String nombre;
}
