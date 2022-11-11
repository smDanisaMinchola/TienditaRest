
package pe.com.tiendita.TienditaRest.service;

import java.util.List;
import java.util.Optional;
import pe.com.tiendita.TienditaRest.entity.Empleado;

public interface EmpleadoServicio {
    
    public List<Empleado>FinAlld();
    public List<Empleado>findAllCustom();
    public Optional<Empleado>findById(long id);
    public Empleado add (Empleado p);
    public Empleado update(Empleado p);
    public Empleado delete(Empleado p);
    
}
