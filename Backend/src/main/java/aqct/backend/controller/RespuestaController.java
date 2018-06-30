package aqct.backend.controller;

import aqct.backend.model.Respuesta;
import aqct.backend.model.RespuestaDAO;
import aqct.backend.model.Usuario;
import aqct.backend.model.UsuarioDAO;
import java.security.Principal;
import java.sql.Timestamp;
import java.time.Instant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PreAuthorize("true")
@RequestMapping("respuesta")
//@Secured("IS_AUTHENTICATED_FULLY")
public class RespuestaController {
    
    @Autowired
    private RespuestaDAO respuestaDAO;
    
    @Autowired
    private UsuarioDAO usuarioDAO;
    
    @PostMapping
    public Long store(@RequestBody Respuesta respuesta, Principal principal){
        // Obtener el objeto del usuario
        Usuario usuario = this.usuarioDAO.findByNombre(principal.getName());
        
        // Si el usuario existe
        if ( usuario != null ) {
            // Fijar la fecha de la respuesta
            respuesta.setCreatedAt(Timestamp.from(Instant.now()));
            respuesta.setUsuario(usuario);
            
            this.respuestaDAO.save(respuesta);
            
            return respuesta.getId();
            
        }
        
        return null;
    }
    
    @GetMapping("{id}")
    public Respuesta show (@PathVariable("id") long id){
        return this.respuestaDAO.findById(id).get();
    }
    
    @DeleteMapping("{id}")
    public void destroy(@PathVariable("id") long id){
        
        this.respuestaDAO.deleteById(id);
        
    }
}
