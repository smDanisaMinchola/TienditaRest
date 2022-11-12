

package pe.com.tiendita.TienditaRest.repositorio;
 
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.tiendita.TienditaRest.entity.SubMenu;

public interface SubMenuRepositorio extends JpaRepository<SubMenu, Long>{
    
     @Query("select c from SubMenu c where c.estado='1'")
    List<SubMenu>findAllCustom();
}
