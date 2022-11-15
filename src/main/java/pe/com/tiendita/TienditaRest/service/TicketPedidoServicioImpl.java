
package pe.com.tiendita.TienditaRest.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.tiendita.TienditaRest.entity.TicketPedido;
import pe.com.tiendita.TienditaRest.repositorio.TicketPedidoRepositorio;

@Service
public class TicketPedidoServicioImpl  implements TicketPedidoServicio{

    @Autowired
    private TicketPedidoRepositorio repositorio;
    @Override
    public List<TicketPedido> findAll() {
      return repositorio.findAll();
      
    }

    @Override
    public Optional<TicketPedido> findById(long id) {
       return repositorio.findById(id);
    }

    @Override
    public TicketPedido add(TicketPedido c) {
        return repositorio.save(c);
    }

    @Override
    public TicketPedido update(TicketPedido c) {
     TicketPedido ticket=repositorio.getById(c.getCodigo());
        BeanUtils.copyProperties(c, ticket);
        return repositorio.save(ticket);
    }


    @Override
    public List<TicketPedido> findAllCustom() {
          return repositorio.findAllCustom();
    }

    @Override
    public void eliminar(long id) {
    repositorio.deleteById(id);
    }
    
    
}
