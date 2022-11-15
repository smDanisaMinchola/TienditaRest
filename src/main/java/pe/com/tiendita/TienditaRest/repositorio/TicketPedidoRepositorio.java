
package pe.com.tiendita.TienditaRest.repositorio;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.tiendita.TienditaRest.entity.TicketPedido;


public interface TicketPedidoRepositorio 
extends JpaRepository<TicketPedido, Long>{
     @Query("select c from TicketPedido c where c.estado='1'")
    List<TicketPedido>findAllCustom();
}
