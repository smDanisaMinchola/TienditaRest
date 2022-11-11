
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
import pe.com.tiendita.TienditaRest.entity.Menu;
import pe.com.tiendita.TienditaRest.service.MenuServicio;

@RestController
@RequestMapping("/menu")
public class MenuRestController {
    
       @Autowired
    private MenuServicio servicio;

    @GetMapping
    public List<Menu> findAll() {
        return servicio.findAlld();
    }
    @GetMapping("/custom")
    public List<Menu>finAllCustom(){
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Menu>finById(@PathVariable long id){
     return servicio.findById(id);
    }
    
    @PostMapping
    public Menu add(@RequestBody Menu p){
        return servicio.add(p);
    }
    
    @PutMapping("/{id}")
    public Menu update(@PathVariable long id,@RequestBody Menu p){
        p.setCodigo(id);
        return servicio.update(p);
    }
     @DeleteMapping("/{id}")
    public Menu delete(@PathVariable long id){
        Menu objproducto=new Menu();
        objproducto.setCategoria(false);
        return servicio.delete(Menu.builder().codigo(id).build());
        
    }
    
}
