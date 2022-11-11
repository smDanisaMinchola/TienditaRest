/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.tiendita.TienditaRest.restController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.tiendita.TienditaRest.entity.Perfil;
import pe.com.tiendita.TienditaRest.service.PerfilServicio;

@RestController
@RequestMapping("/perfil")
public class PerfilRestController {
      @Autowired
    private PerfilServicio servicio;

    @GetMapping
    public List<Perfil> findAll() {
        return servicio.FinAlld();
    }
    
}
