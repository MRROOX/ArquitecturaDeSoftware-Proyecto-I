package aqct.backend.jwt;

import static model.ProyectoVPPPersistentManager.instance;
import model.Usuario;
import model.UsuarioDAO;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.orm.PersistentSession;

public class UserRepository {
    
    public static Usuario findByUsername(String username) {
        
        try {
            
            // Obtener instancia de sesión
            PersistentSession session = instance().getSession();
            
            // Crear una criteria para la búsqueda
            Criteria criteria = session.createCriteria(Usuario.class);
            
            // Agregar restricción (nombre = username)
            criteria.add( Restrictions.eq("nombre", username) );
            
            // Obtener resultados de criteria
            List<Usuario> usuarios = criteria.list();
            
            // Retornar primer resultado
            return usuarios.iterator().next();
            
        } catch ( Exception e ) {
            
        }
        
        return null;
        
    }
    
}