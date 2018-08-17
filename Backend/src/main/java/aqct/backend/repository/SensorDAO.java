package aqct.backend.repository;

import aqct.backend.model.Sensor;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface SensorDAO extends CrudRepository<Sensor, Long> {
    
    public List<Sensor> findAll();
    
}
