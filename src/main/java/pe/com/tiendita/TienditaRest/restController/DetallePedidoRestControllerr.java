
package pe.com.tiendita.TienditaRest.restController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.tiendita.TienditaRest.entity.DetallePedido;
import pe.com.tiendita.TienditaRest.service.DetallePedidoServicio;

@RestController
@RequestMapping("/detalle")
public class DetallePedidoRestControllerr {
    @Autowired
    private DetallePedidoServicio servicio;
    
    @GetMapping
    public List<DetallePedido> findAll() {
        return servicio.findAll();
        
    }
    
}
