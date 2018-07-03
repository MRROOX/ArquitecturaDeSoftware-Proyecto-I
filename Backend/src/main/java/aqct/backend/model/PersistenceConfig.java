package aqct.backend.model;

import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class PersistenceConfig {

    @Autowired
    private PlatformTransactionManager tm;

    @Bean
    public Hibernate5Module getHibernateModuleBean() {
        return new Hibernate5Module();
    }

}
