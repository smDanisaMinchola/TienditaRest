
package pe.com.tiendita.TienditaRest.service;

import java.util.List;
import java.util.Optional;
import pe.com.tiendita.TienditaRest.entity.Distrito;


public interface DistritoService {
    public List<Distrito>findAll();
    
      public List<Distrito> findAllCustom();

    public Optional<Distrito> findById(long id);

    public Distrito add(Distrito c);

    public Distrito update(Distrito c);

    public Distrito delete(Distrito c);
    
}
