
package pe.com.tiendita.TienditaRest.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.tiendita.TienditaRest.entity.MenuDetalle;
import pe.com.tiendita.TienditaRest.repositorio.MenuDetalleRepositorio;

@Service
public class MenuDetalleServicioImpl implements MenuDetalleServicio{

    @Autowired
    private MenuDetalleRepositorio repositorio;
    @Override
    public List<MenuDetalle> findAlld() {
     return repositorio.findAll();
    }
    @Override
    public Optional<MenuDetalle> findById(long id) {
       return repositorio.findById(id);
    }

    @Override
    public MenuDetalle add(MenuDetalle p) {
      return repositorio.save(p);
    }

    @Override
    public MenuDetalle update(MenuDetalle p) {
       MenuDetalle menude=repositorio.getById(p.getCodigo());
        BeanUtils.copyProperties(p, menude);
        return repositorio.save(menude);
    }


    @Override
    public void delete(long id) {
     repositorio.deleteById(id);
    }
    
}
