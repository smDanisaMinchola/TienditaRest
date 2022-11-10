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
import pe.com.tiendita.TienditaRest.entity.Cliente;
import pe.com.tiendita.TienditaRest.entity.Producto;
import pe.com.tiendita.TienditaRest.service.ClienteServicio;

@RestController
@RequestMapping("/cliente")
public class ClienteRestController {
    
     @Autowired
    private ClienteServicio servicio;

    @GetMapping
    public List<Cliente> findAll() {
        return servicio.findAll();
    }
    
    @GetMapping("/custom")
    public List<Cliente>finAllCustom(){
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Cliente>finById(@PathVariable long id){
     return servicio.findById(id);
    }
    
    @PostMapping
    public Cliente add(@RequestBody Cliente p){
        return servicio.add(p);
    }
    
    @PutMapping("/{id}")
    public Cliente update(@PathVariable long id,@RequestBody Cliente p){
        p.setCodigo(id);
        return servicio.update(p);
    }
     @DeleteMapping("/{id}")
    public Cliente delete(@PathVariable long id){
        Cliente objproducto=new Cliente();
        objproducto.setEstado(false);
        return servicio.delete(Cliente.builder().codigo(id).build());
        
    }
    
    
}
