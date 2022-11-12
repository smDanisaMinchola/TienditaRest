
package pe.com.tiendita.TienditaRest.service;

import java.util.List;
import java.util.Optional;
import pe.com.tiendita.TienditaRest.entity.MenuDetalle;

public interface MenuDetalleServicio {
    
    public List<MenuDetalle>findAlld();
   
    public Optional<MenuDetalle> findById(long id);

    public MenuDetalle add(MenuDetalle p);

    public MenuDetalle update(MenuDetalle p);

    public MenuDetalle delete(MenuDetalle p);
}
