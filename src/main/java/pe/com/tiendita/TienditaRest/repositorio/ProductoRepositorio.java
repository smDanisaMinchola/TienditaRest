
package pe.com.tiendita.TienditaRest.repositorio;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.com.tiendita.TienditaRest.entity.Producto;

@Repository
public interface ProductoRepositorio extends JpaRepository<Producto, Long>{
    @Query("select p from Producto p where p.estado='1'")
    List<Producto>findAllCustom();
}
