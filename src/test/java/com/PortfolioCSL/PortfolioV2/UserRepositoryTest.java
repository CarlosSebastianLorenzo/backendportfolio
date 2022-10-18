
package com.PortfolioCSL.PortfolioV2;

import com.PortfolioCSL.PortfolioV2.model.Usuario;
import com.PortfolioCSL.PortfolioV2.repository.IUsuarioRepository;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTest {
    
    @Autowired
    IUsuarioRepository repo;
    
    @Test
    public void testCreateUser(){
        PasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
        String rawPassword="12345678";
        String encodePassword=passwordEncoder.encode(rawPassword);
        Usuario newUser=new Usuario("carlos@gmail.com", encodePassword);
        Usuario savedUser=repo.save(newUser);
        assertThat(savedUser).isNotNull();
        assertThat(savedUser.getId()).isGreaterThan(0);
        
    }
    
    
}
