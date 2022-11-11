
package pe.com.tiendita.TienditaRest.restController;
/*
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
import pe.com.tiendita.TienditaRest.entity.SubMenu;
import pe.com.tiendita.TienditaRest.service.SubMenuServicio;

@RestController
@RequestMapping("/submenu")
public class SubMenuRestController {
    
    @Autowired
    private SubMenuServicio servicio;
    
     @GetMapping
    public List<SubMenu> findAll() {
        return servicio.findAlld();
    }
    @GetMapping("/custom")
    public List<SubMenu>finAllCustom(){
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<SubMenu>finById(@PathVariable long id){
     return servicio.findById(id);
    }
    
    @PostMapping
    public SubMenu add(@RequestBody SubMenu p){
        return servicio.add(p);
    }
    
    @PutMapping("/{id}")
    public SubMenu update(@PathVariable long id,@RequestBody SubMenu p){
        p.setCodigo(id);
        return servicio.update(p);
    }
    
     @DeleteMapping("/{id}")
    public SubMenu delete(@PathVariable long id){
        SubMenu objproducto=new SubMenu();
        objproducto.setEstado(false);
        return servicio.delete(SubMenu.builder().codigo(id).build());
        
    }

}
*/