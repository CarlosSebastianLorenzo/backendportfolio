
package com.PortfolioCSL.PortfolioV2.repository;

import com.PortfolioCSL.PortfolioV2.model.Habilidades;
import com.PortfolioCSL.PortfolioV2.model.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IHabilidadesRepository extends JpaRepository<Habilidades,Long> {
    
     @Query("select x from Habilidades x where x.usuario like :var_parm")
    public abstract List<Habilidades> listaPorUsuarioId(@Param("var_parm") Usuario usuario);
    
}
