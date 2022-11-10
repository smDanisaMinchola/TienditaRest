/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
import pe.com.tiendita.TienditaRest.entity.Distrito;
import pe.com.tiendita.TienditaRest.service.DistritoService;

@RestController
@RequestMapping("/distrito")
public class DistritoRestController {
      @Autowired
    private DistritoService servicio;

    @GetMapping
    public List<Distrito> findAll() {
        return servicio.findAll();
    }
    
    @GetMapping("/custom")
    public List<Distrito>finAllCustom(){
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Distrito>finById(@PathVariable long id){
     return servicio.findById(id);
    }
    
    @PostMapping
    public Distrito add(@RequestBody Distrito c){
        return servicio.add(c);
    }
    
    @PutMapping("/{id}")
    public Distrito update(@PathVariable long id,@RequestBody Distrito c){
        c.setCodigo(id);
        return servicio.update(c);
    }
     @DeleteMapping("/{id}")
    public Distrito delete(@PathVariable long id){
       Distrito objcategoria=new Distrito();
        objcategoria.setEstado(false);
        return servicio.delete(Distrito.builder().codigo(id).build());
        
    }
    
    
    

}