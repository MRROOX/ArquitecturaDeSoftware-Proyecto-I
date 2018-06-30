package aqct.backend.model;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface PreguntaDAO extends CrudRepository<Pregunta, Long> {
    
    @Override
    public List<Pregunta> findAll();
    
}
