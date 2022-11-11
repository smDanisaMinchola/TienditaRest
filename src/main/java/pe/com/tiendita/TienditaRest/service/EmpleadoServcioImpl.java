
package pe.com.tiendita.TienditaRest.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.tiendita.TienditaRest.entity.Empleado;
import pe.com.tiendita.TienditaRest.repositorio.EmpleadoRepositorio;

@Service
public class EmpleadoServcioImpl implements EmpleadoServicio{

    @Autowired
    private EmpleadoRepositorio repositorio;
    @Override
    public List<Empleado> findAll() {
       return repositorio.findAll();
    }

    @Override
    public List<Empleado> findAllCustom() {
        return repositorio.findAllCustom();
        
    }

    @Override
    public Optional<Empleado> findbyId(long id) {
      return repositorio.findById(id);
    }

    @Override
    public Empleado add(Empleado p) {
       return repositorio.save(p);
    }

    @Override
    public Empleado update(Empleado p) {
      Empleado objempleado=repositorio.getById(p.getCodigo());
        BeanUtils.copyProperties(p, objempleado);
        return repositorio.save(objempleado);
    }

    @Override
    public Empleado delete(Empleado p) {
        Empleado objempleado=repositorio.getById(p.getCodigo());
  objempleado.setEstado(false);
  return repositorio.save(objempleado);
    }
    
}
