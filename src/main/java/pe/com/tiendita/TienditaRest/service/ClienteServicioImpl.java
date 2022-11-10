
package pe.com.tiendita.TienditaRest.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.tiendita.TienditaRest.entity.Cliente;
import pe.com.tiendita.TienditaRest.repositorio.ClienteRepositorio;

@Service
public class ClienteServicioImpl implements ClienteServicio{
    

    @Autowired
    private ClienteRepositorio repositorio;
    
    @Override
    public List<Cliente> findAll() {
       return repositorio.findAll();
    }

    @Override
    public List<Cliente> findAllCustom() {
       return repositorio.findAllCustom();
    }

    @Override
    public Optional<Cliente> findById(long id) {
      return repositorio.findById(id);
    }

    @Override
    public Cliente add(Cliente p) {
        return repositorio.save(p);
    }

    @Override
    public Cliente update(Cliente p) {
        Cliente objCliente=repositorio.getById(p.getCodigo());
        BeanUtils.copyProperties(p,objCliente);
       return repositorio.save(objCliente); 
    }

    @Override
    public Cliente delete(Cliente p) {
       Cliente objCliente=repositorio.getById(p.getCodigo());
    
  objCliente.setEstado(false);
  return repositorio.save(objCliente);
    }
    
    
}
