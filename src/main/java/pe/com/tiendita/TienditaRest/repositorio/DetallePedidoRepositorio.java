
package pe.com.tiendita.TienditaRest.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.com.tiendita.TienditaRest.entity.DetallePedido;
import pe.com.tiendita.TienditaRest.entity.TicketPedido;


public interface DetallePedidoRepositorio extends JpaRepository<DetallePedido,TicketPedido> {
    
}
