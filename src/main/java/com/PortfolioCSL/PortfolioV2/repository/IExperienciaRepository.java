
package com.PortfolioCSL.PortfolioV2.repository;

import com.PortfolioCSL.PortfolioV2.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperienciaRepository extends JpaRepository<Experiencia,Long> {
    
}
