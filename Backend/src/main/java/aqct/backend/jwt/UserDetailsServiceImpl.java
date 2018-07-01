package aqct.backend.jwt;

import aqct.backend.model.Usuario;
import aqct.backend.model.UsuarioDAO;
import static java.util.Collections.emptyList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    
    @Autowired
    private UsuarioDAO usuarioDAO;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        
        Usuario user = this.usuarioDAO.findByNombre(username);
        
        if ( user == null ) {
            throw new UsernameNotFoundException(username);
        }
        
        return new org.springframework.security.core.userdetails.User(user.getNombre(), user.getPassword(), emptyList());
        
    }
    
    public Usuario getUserByUsername(String username) {
        
        return this.usuarioDAO.findByNombre(username);
        
    }
    
}
