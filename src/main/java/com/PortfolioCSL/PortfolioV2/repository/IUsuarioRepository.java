
package com.PortfolioCSL.PortfolioV2.repository;

import com.PortfolioCSL.PortfolioV2.model.Usuario;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario,Long> {
    
     @Query("select x from Usuario x where x.email like :var_parm")
    public abstract List<Usuario> listaPorEmail(@Param("var_parm") String email);
    
    @Query("select x from Usuario x where x.email like :var_parm")
    public Optional<Usuario> findByEmail(@Param("var_parm") String email);
}
