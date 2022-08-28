
package com.PortfolioCSL.PortfolioV2.repository;

import com.PortfolioCSL.PortfolioV2.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario,Long> {
    
}
