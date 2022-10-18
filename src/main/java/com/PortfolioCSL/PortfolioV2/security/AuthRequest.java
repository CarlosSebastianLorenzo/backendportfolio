
package com.PortfolioCSL.PortfolioV2.security;

import javax.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthRequest {
    @Email
    private String email;
    private String contrasenia;
    
}
