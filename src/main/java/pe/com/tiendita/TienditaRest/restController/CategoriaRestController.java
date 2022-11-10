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
import pe.com.tiendita.TienditaRest.entity.Categoria;
import pe.com.tiendita.TienditaRest.service.CategoriaService;


@RestController
@RequestMapping("/categoria")
public class CategoriaRestController {

    @Autowired
    private CategoriaService servicio;

    @GetMapping
    public List<Categoria> findAll() {
        return servicio.findAll();
    }
    
    @GetMapping("/custom")
    public List<Categoria>finAllCustom(){
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Categoria>finById(@PathVariable long id){
     return servicio.findById(id);
    }
    
    @PostMapping
    public Categoria add(@RequestBody Categoria c){
        return servicio.add(c);
    }
    
    @PutMapping("/{id}")
    public Categoria update(@PathVariable long id,@RequestBody Categoria c){
        c.setCodigo(id);
        return servicio.update(c);
    }
     @DeleteMapping("/{id}")
    public Categoria delete(@PathVariable long id){
        Categoria objcategoria=new Categoria();
        objcategoria.setEstado(false);
        return servicio.delete(Categoria.builder().codigo(id).build());
        
    }
    
    
}

