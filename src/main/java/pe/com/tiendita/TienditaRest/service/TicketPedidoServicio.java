
package pe.com.tiendita.TienditaRest.service;

import java.util.List;
import java.util.Optional;
import pe.com.tiendita.TienditaRest.entity.TicketPedido;

public interface TicketPedidoServicio {
     public List<TicketPedido>findAll();
 public List<TicketPedido> findAllCustom();

    public Optional<TicketPedido> findById(long id);

    public TicketPedido add(TicketPedido c);

    public TicketPedido update(TicketPedido c);

    public void eliminar(long id);
}
