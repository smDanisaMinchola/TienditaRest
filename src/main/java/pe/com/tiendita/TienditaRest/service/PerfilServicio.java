/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.tiendita.TienditaRest.service;

import java.util.List;
import java.util.Optional;
import pe.com.tiendita.TienditaRest.entity.Perfil;

public interface PerfilServicio {
    
    public List<Perfil>FinAll();
    
     public List<Perfil> findAllCustom();

    public Optional<Perfil> findById(long id);

    public Perfil add(Perfil p);

    public Perfil update(Perfil p);

    public Perfil delete(Perfil p);
}
