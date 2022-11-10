
package pe.com.tiendita.TienditaRest.service;

import java.util.List;
import java.util.Optional;
import pe.com.tiendita.TienditaRest.entity.Cliente;



public interface ClienteServicio {
     public List<Cliente> findAll();

    public List<Cliente> findAllCustom();

    public Optional<Cliente> findById(long id);

    public Cliente add(Cliente p);

    public Cliente update(Cliente p);

    public Cliente delete(Cliente p);
    
}
