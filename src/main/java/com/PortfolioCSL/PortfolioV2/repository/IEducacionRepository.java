
package com.PortfolioCSL.PortfolioV2.repository;

import com.PortfolioCSL.PortfolioV2.model.Educacion;
import com.PortfolioCSL.PortfolioV2.model.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducacionRepository extends JpaRepository<Educacion,Long>{
    
    @Query("select x from Educacion x where x.usuario like :var_parm")
    public abstract List<Educacion> listaPorUsuarioId(@Param("var_parm") Usuario usuario);
    
}
