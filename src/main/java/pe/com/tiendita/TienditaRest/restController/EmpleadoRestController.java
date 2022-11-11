
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
import pe.com.tiendita.TienditaRest.entity.Empleado;
import pe.com.tiendita.TienditaRest.service.EmpleadoServicio;

@RestController
@RequestMapping("/empleado")
public class EmpleadoRestController {
    
    @Autowired
    private EmpleadoServicio servicio;
   
    @GetMapping
    public List<Empleado> findAll() {
        return servicio.findAll();
    }
     
   @GetMapping("/custom")
    public List<Empleado>finAllCustom(){
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Empleado>finById(@PathVariable long id){
     return servicio.findbyId(id);
    }
    
    @PostMapping
    public Empleado add(@RequestBody Empleado p){
        return servicio.add(p);
    }
    
    @PutMapping("/{id}")
    public Empleado update(@PathVariable long id,@RequestBody Empleado p){
        p.setCodigo(id);
        return servicio.update(p);
    }
     @DeleteMapping("/{id}")
    public Empleado delete(@PathVariable long id){
        Empleado objproducto=new Empleado();
        objproducto.setEstado(false);
        return servicio.delete(Empleado.builder().codigo(id).build());
        
    }
    
}
