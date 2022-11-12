
package pe.com.tiendita.TienditaRest.restController;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.tiendita.TienditaRest.entity.MenuDetalle;
import pe.com.tiendita.TienditaRest.service.MenuDetalleServicio;


@RestController
@RequestMapping("/menudetalle")
public class MenuDetalleRestController {
       @Autowired
    private MenuDetalleServicio servicio;
       
        @GetMapping
    public List<MenuDetalle> findAll() {
        return servicio.findAlld();
    }
   
     @GetMapping("/{id}")
    public Optional<MenuDetalle>finById(@PathVariable long id){
     return servicio.findById(id);
    }
    
    @PostMapping
    public MenuDetalle add(@RequestBody MenuDetalle p){
        return servicio.add(p);
    }
    
     @PutMapping("/{id}")
    public MenuDetalle update(@PathVariable long id,@RequestBody MenuDetalle p){
        p.setCodigo(id);
        return servicio.update(p);
    }
    
    
}
