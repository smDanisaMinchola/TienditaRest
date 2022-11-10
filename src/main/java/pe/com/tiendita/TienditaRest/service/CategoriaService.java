package pe.com.tiendita.TienditaRest.service;

import java.util.List;
import java.util.Optional;
import pe.com.tiendita.TienditaRest.entity.Categoria;

public interface CategoriaService {

    public List<Categoria>findAll();

   public List<Categoria> findAllCustom();

    public Optional<Categoria> findById(long id);

    public Categoria add(Categoria c);

    public Categoria update(Categoria c);

    public Categoria delete(Categoria c);

}

