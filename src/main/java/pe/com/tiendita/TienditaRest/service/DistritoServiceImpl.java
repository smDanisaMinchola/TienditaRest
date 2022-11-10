
package pe.com.tiendita.TienditaRest.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.tiendita.TienditaRest.entity.Distrito;
import pe.com.tiendita.TienditaRest.repositorio.DistritoRepositorio;


@Service
public class DistritoServiceImpl implements DistritoService{

      @Autowired
  private DistritoRepositorio repositorio;
    
    @Override
    public List<Distrito> findAll() {
      return repositorio.findAll();
    }
    @Override
    public List<Distrito> findAllCustom() {
       return repositorio.findAllCustom();
    }
    @Override
    public Optional<Distrito> findById(long id) {
        return repositorio.findById(id);
    }
    @Override
    public Distrito add(Distrito c) {
        return repositorio.save(c);
    }
    @Override
    public Distrito update(Distrito c) {
       Distrito objproducto=repositorio.getById(c.getCodigo());
        BeanUtils.copyProperties(c,objproducto);
       return repositorio.save(objproducto);     
    }
    
    @Override
    public Distrito delete(Distrito c) {
          Distrito objdistrito=repositorio.getById(c.getCodigo());
    
  objdistrito.setEstado(false);
  return repositorio.save(objdistrito);
  
    }
}
