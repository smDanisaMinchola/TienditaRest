
package pe.com.tiendita.TienditaRest.repositorio;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.tiendita.TienditaRest.entity.Distrito;


public interface DistritoRepositorio extends JpaRepository<Distrito, Long>{
    
     @Query("select c from Distrito c where c.estado='1'")
    List<Distrito>findAllCustom();
  
    
}
