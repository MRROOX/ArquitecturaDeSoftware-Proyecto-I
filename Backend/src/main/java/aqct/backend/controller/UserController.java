/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aqct.backend.controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import model.Usuario;
import model.UsuarioDAO;
import org.orm.PersistentException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Batman
 */
@RestController
public class UserController {

    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @PostMapping("usuario")
    public int store(@RequestParam Usuario usuario) {

        try {

            // Encriptar contraseña de usuario
            usuario.setPassword(this.passwordEncoder.encode(usuario.getPassword()));

            if (UsuarioDAO.save(usuario)) {
                return 1;
            } else {
                return 0;
            }
        } catch (PersistentException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 2;
    }

    @GetMapping("usuario/{id}")
    public Usuario show(@PathVariable(value = "usuarioid") int id) {

        return new Usuario();
    }

}
