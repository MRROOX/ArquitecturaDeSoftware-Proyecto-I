package aqct.backend.controller;

import aqct.backend.model.Respuesta;
import aqct.backend.repository.RespuestaDAO;
import aqct.backend.model.Usuario;
import aqct.backend.repository.UsuarioDAO;
import java.security.Principal;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("respuesta")
@Secured("IS_AUTHENTICATED_FULLY")
public class RespuestaController {

    @Autowired
    private RespuestaDAO respuestaDAO;

    @Autowired
    private UsuarioDAO usuarioDAO;

    @GetMapping("noaprobados")
    public List<Respuesta> indexNoAprobados() {

        return this.respuestaDAO.findByAprobado(false);

    }

    @PostMapping
    public Long store(@RequestBody Respuesta respuesta, Principal principal) {
        // Obtener el objeto del usuario
        Usuario usuario = this.usuarioDAO.findByNombre(principal.getName());

        // Si el usuario existe
        if (usuario != null) {
            // Fijar la fecha de la respuesta
            respuesta.setCreatedAt(Timestamp.from(Instant.now()));
            respuesta.setUsuario(usuario);
            respuesta.setAprobado(false);

            this.respuestaDAO.save(respuesta);

            return respuesta.getId();

        }

        return null;
    }

    @GetMapping("{id}")
    public Respuesta show(@PathVariable("id") long id) {
        return this.respuestaDAO.findById(id).get();
    }

    @GetMapping("aprobar/{id}")
    public void aprobar(@PathVariable("id") long id) {
        // Obtener respuesta
        Respuesta respuesta = this.respuestaDAO.findById(id).get();
        
        // Validar respuesta
        if ( respuesta != null ) {
            // Aprobar
            respuesta.setAprobado(true);
            
            // Guardar
            this.respuestaDAO.save(respuesta);
        }
    }

    @DeleteMapping("{id}")
    public void destroy(@PathVariable("id") long id) {
        this.respuestaDAO.deleteById(id);
    }
}
