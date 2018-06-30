/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aqct.backend.seeder;

import static model.ProyectoVPPPersistentManager.instance;
import model.Rol;
import model.RolDAO;
import org.orm.PersistentException;
import org.orm.PersistentSession;

/**
 *
 * @author matia
 */
public class RolSeeder {
    
    public static void seed() throws PersistentException {
        
        PersistentSession session = instance().getSession();
        
        Rol rolUsuario = new Rol();
        Rol rolModerador = new Rol();
        
        rolUsuario.setNombre("Usuario");
        rolModerador.setNombre("Moderador");
        
        RolDAO.save(rolUsuario);
        RolDAO.save(rolModerador);
        
    }
    
}
