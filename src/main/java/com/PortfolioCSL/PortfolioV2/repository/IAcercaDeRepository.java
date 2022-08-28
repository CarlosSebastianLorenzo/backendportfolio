
package com.PortfolioCSL.PortfolioV2.repository;

import com.PortfolioCSL.PortfolioV2.model.AcercaDe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAcercaDeRepository extends JpaRepository<AcercaDe, Long>{
    
}
