package aqct.backend.model;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface RespuestaDAO extends CrudRepository<Respuesta, Long> {
    
    @Override
    public List<Respuesta> findAll();
    
}
