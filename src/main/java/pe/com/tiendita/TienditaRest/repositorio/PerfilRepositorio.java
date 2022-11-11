/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.tiendita.TienditaRest.repositorio;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.tiendita.TienditaRest.entity.Perfil;


public interface PerfilRepositorio extends JpaRepository<Perfil, Long>{
    
        @Query("select c from Perfil c where c.estado='1'")
         List<Perfil>findAllCustom();
}
