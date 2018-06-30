package aqct.backend.controller;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Rol;
import model.RolDAO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import model.Usuario;
import model.UsuarioDAO;
import org.orm.PersistentException;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Batman
 */
@RestController
@PreAuthorize("true")
@RequestMapping("usuario")
public class UsuarioController {

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    /**
     * Retorna la lista de todos los usuarios registrados en el sistema
     *
     * @return Lista de Usuario
     * @throws org.orm.PersistentException
     */
    @GetMapping
    public List<Usuario> index() throws PersistentException {

        return Arrays.asList(UsuarioDAO.listUsuarioByQuery(null, null));

    }

    /**
     * Pemite guardar un usuario dentro de la base de datos
     *
     * @param usuario Un Usuario que se desea guardar (debe ser enviado en
     * formato JSON)
     * @return Numero id asignado al usuario registrado
     * @throws org.orm.PersistentException
     */
    @PostMapping
    public Integer store(@RequestBody Usuario usuario) throws PersistentException {
        // Rol para usuarios comunes
        Rol rol = RolDAO.getRolByORMID(1);

        // Encriptar contraseña de usuario
        usuario.setPassword(this.passwordEncoder.encode(usuario.getPassword()));

        usuario.setRol(rol);
        //Instante en que se guarda el usuario en la base de datos
        usuario.setCreated_at(Timestamp.from(Instant.now()));

        if (UsuarioDAO.save(usuario)) {
            return usuario.getId();
        }

        return null;
    }

    /**
     * Busca y obtiene el Usuario asosiado a un id
     *
     * @param id Id del usuario
     * @return El objeto usuario como un JSON
     */
    @GetMapping("{id}")
    public Usuario show(@PathVariable(value = "id") Integer id) {

        try {
            return UsuarioDAO.getUsuarioByORMID(id);
        } catch (Exception ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    /**
     * Eliminar a un Usuario por su Id
     *
     * @param id Id del usuario que se desea eliminar
     * @throws org.orm.PersistentException
     */
    @DeleteMapping("{id}")
    public void destroy(@PathVariable("id") int id) throws PersistentException {

        UsuarioDAO.delete(UsuarioDAO.getUsuarioByORMID(id));

    }

}
