package pe.com.tiendita.TienditaRest.repositorio;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.tiendita.TienditaRest.entity.Cliente;


public interface ClienteRepositorio extends JpaRepository<Cliente, Long>{
    @Query("select c from Cliente c where c.estado='1'")
    List<Cliente>findAllCustom();
    
}
