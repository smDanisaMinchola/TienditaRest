
package pe.com.tiendita.TienditaRest.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.tiendita.TienditaRest.entity.Perfil;
import pe.com.tiendita.TienditaRest.repositorio.PerfilRepositorio;

@Service
public class PerfilServiceImple  implements PerfilServicio{
@Autowired
private PerfilRepositorio repositorio;
    
    @Override
    public List<Perfil> FinAll() {
        return repositorio.findAll();
    }

  
    @Override
    public List<Perfil> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public Optional<Perfil> findById(long id) {
       return repositorio.findById(id);
    }

    @Override
    public Perfil add(Perfil p) {
       return repositorio.save(p);
    }

    @Override
    public Perfil update(Perfil p) {
      Perfil perfil=repositorio.getById(p.getCodigo());
        BeanUtils.copyProperties(p,perfil);
       return repositorio.save(perfil);  
      
    }

    @Override
    public Perfil delete(Perfil p) {
       Perfil perfil=repositorio.getById(p.getCodigo());
    
  perfil.setEstado(false);
  return repositorio.save(perfil);
    }
    
}
