
package pe.com.tiendita.TienditaRest.restController;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.tiendita.TienditaRest.entity.TicketPedido;
import pe.com.tiendita.TienditaRest.service.TicketPedidoServicio;

@RestController
@RequestMapping("/ticket")
public class TicketPedidoRestController {
    
    @Autowired
    private TicketPedidoServicio servicio;

    @GetMapping
    public List<TicketPedido> findAll() {
        return servicio.findAll();
    }
    @GetMapping("/custom")
    public List<TicketPedido> findAllCustom() {
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<TicketPedido>finById(@PathVariable long id){
     return servicio.findById(id);
    }
    
    @PostMapping
    public TicketPedido add(@RequestBody TicketPedido c){
        return servicio.add(c);
    }
    
    @PutMapping("/{id}")
    public TicketPedido update(@PathVariable long id,@RequestBody TicketPedido c){
        c.setCodigo(id);
        return servicio.update(c);
    }
    
    @DeleteMapping("/{id}")
    public void elimina(@PathVariable("id")long id)
    {
    servicio.eliminar(id);
    
    }
    
}
