
package pe.com.tiendita.TienditaRest.service;
/*
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import pe.com.tiendita.TienditaRest.entity.SubMenu;
import pe.com.tiendita.TienditaRest.repositorio.SubMenuRepositorio;

@Servicio
public class SubMenuServcioImpl implements SubMenuServicio{

    @Autowired
    private SubMenuRepositorio repositorio;
    @Override
    public List<SubMenu> findAlld() {
      return repositorio.findAll();
    }

    @Override
    public List<SubMenu> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public Optional<SubMenu> findById(long id) {
       return repositorio.findById(id);
    }

    @Override
    public SubMenu add(SubMenu p) {
        return repositorio.save(p);
    }

    @Override
    public SubMenu update(SubMenu p) {
      SubMenu sub=repositorio.getById(p.getCodigo());
        BeanUtils.copyProperties(p, sub);
        return repositorio.save(sub);
        
    }

    @Override
    public SubMenu delete(SubMenu p) {
       SubMenu sub=repositorio.getById(p.getCodigo());
       sub.setEstado(false);
       return repositorio.save(sub);
    } 
    
}
*/