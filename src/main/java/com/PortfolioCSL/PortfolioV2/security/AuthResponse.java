
package com.PortfolioCSL.PortfolioV2.security;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthResponse {
    private Long id;
    private String email;
    private String accessToken;
    
    
    public AuthResponse() {
    }

    public AuthResponse(Long id, String email, String accessToken) {
        this.id= id;
        this.email = email;
        this.accessToken = accessToken;
    }
    
}
