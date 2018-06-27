package aqct.backend.jwt;

import model.Usuario;
import static java.util.Collections.emptyList;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    
    private final UserRepository userRepository = new UserRepository();
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        
        Usuario user = userRepository.findByUsername(username);
        
        if ( user == null ) {
            throw new UsernameNotFoundException(username);
        }
        
        return new org.springframework.security.core.userdetails.User(user.getNombre(), user.getPassword(), emptyList());
        
    }
    
}
