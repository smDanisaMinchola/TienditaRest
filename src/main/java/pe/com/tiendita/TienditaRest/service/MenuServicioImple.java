
package pe.com.tiendita.TienditaRest.service;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.tiendita.TienditaRest.entity.Menu;
import pe.com.tiendita.TienditaRest.repositorio.MenuRepositorio;

@Service
public class MenuServicioImple implements MenuServicio{
@Autowired
private MenuRepositorio repositorio;
    
    @Override
    public List<Menu> findAlld() {
     return repositorio.findAll();
    }

    @Override
    public List<Menu> findAllCustom() {
       return repositorio.findAllCustom();
    }

    @Override
    public Optional<Menu> findById(long id) {
       return repositorio.findById(id);
    }

    @Override
    public Menu add(Menu p) {
       return repositorio.save(p);
       
    }

    @Override
    public Menu update(Menu p) {
      Menu menu=repositorio.getById(p.getCodigo());
        BeanUtils.copyProperties(p, menu);
        return repositorio.save(menu);
    }

    @Override
    public Menu delete(Menu p) {
       Menu menu =repositorio.getById(p.getCodigo());
       menu.setCategoria(false);
       return repositorio.save(menu);
    }
    
    
}
