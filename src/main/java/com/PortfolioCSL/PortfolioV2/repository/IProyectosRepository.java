
package com.PortfolioCSL.PortfolioV2.repository;

import com.PortfolioCSL.PortfolioV2.model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProyectosRepository extends JpaRepository<Proyectos,Long>{
    
}
