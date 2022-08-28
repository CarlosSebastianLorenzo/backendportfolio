
package com.PortfolioCSL.PortfolioV2.repository;

import com.PortfolioCSL.PortfolioV2.model.RedesSociales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRedesSocialesRepository extends JpaRepository<RedesSociales,Long>{
    
}
