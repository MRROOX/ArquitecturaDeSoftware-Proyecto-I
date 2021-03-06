package aqct.backend.repository;

import aqct.backend.model.Usuario;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author matia
 */
public interface UsuarioDAO extends CrudRepository<Usuario, Long> {

    public Usuario findByNombre(String name);
    
    @Override
    public List<Usuario> findAll();

}
