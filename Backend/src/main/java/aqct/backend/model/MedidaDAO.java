package aqct.backend.model;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface MedidaDAO extends CrudRepository<Medida, Long> {
    
    @Override
    public List<Medida> findAll();
    
}
