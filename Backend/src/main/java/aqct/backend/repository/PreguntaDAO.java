package aqct.backend.repository;

import aqct.backend.model.Pregunta;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface PreguntaDAO extends CrudRepository<Pregunta, Long> {
    
    @Override
    public List<Pregunta> findAll();
    
    public List<Pregunta> findAllByAprobado(boolean aprobado);
    
}
