package aqct.backend.seeder;

import aqct.backend.model.Rol;

/**
 *
 * @author matia
 */
public class RolSeeder {
    
    public static void seed() {
        
        Rol rolUsuario = new Rol();
        Rol rolModerador = new Rol();
        
        rolUsuario.setNombre("Usuario");
        rolModerador.setNombre("Moderador");
        
    }
    
}
