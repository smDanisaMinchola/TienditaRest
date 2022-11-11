/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.tiendita.TienditaRest.repositorio;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.tiendita.TienditaRest.entity.Empleado;


public interface EmpleadoRepositorio extends JpaRepository<Empleado, Long>{
    
    @Query("select e from Empleado e where e.estado='1'")
    List<Empleado>finAllCustom();
}
