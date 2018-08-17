package aqct.backend.repository;

import aqct.backend.model.Respuesta;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface RespuestaDAO extends CrudRepository<Respuesta, Long> {
    
    @Override
    public List<Respuesta> findAll();
    
    public List<Respuesta> findByAprobado(boolean aprobado);
    
}
