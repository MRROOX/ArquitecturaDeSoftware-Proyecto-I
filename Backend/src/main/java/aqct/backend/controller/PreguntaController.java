/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aqct.backend.controller;

import aqct.backend.model.Pregunta;
import aqct.backend.model.PreguntaDAO;
import aqct.backend.model.Respuesta;
import aqct.backend.model.Usuario;
import aqct.backend.model.UsuarioDAO;
import java.security.Principal;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.ArrayList;
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

/**
 *
 * @author Batman
 */
@RestController
@RequestMapping("pregunta")
@Secured("IS_AUTHENTICATED_FULLY")
public class PreguntaController {
    
    @Autowired
    private PreguntaDAO preguntaDAO;
    
    @Autowired
    private UsuarioDAO usuarioDAO;

    /**
     * Lista todas las preguntas que se encuentran en la base de datos del
     * sistema
     *
     * @return Lista con las preguntas
     */
    @GetMapping
    public List<Pregunta> index(){

        return this.preguntaDAO.findAll();

    }
    
    /**
     * Lista todas las preguntas que se encuentran aprobadas
     * 
     * @return Lista de preguntas aprobadas
     */
    @GetMapping("aprobados")
    public List<Pregunta> indexAprobados() {
        
        // Obtener preguntas
        List<Pregunta> preguntas = this.preguntaDAO.findAllByAprobado(true);
        
        // Por cada pregunta
        for ( Pregunta pregunta : preguntas ) {
            // Filtrar respuestas
            List<Respuesta> respuestas = new ArrayList<>();
            
            // Cachear respuestas
            for ( Respuesta respuesta : pregunta.getRespuestas() ) {
                // Si la respuesta ha sido aprobada
                if ( respuesta.isAprobado() ) {
                    respuestas.add(respuesta);
                }
            }
            
            pregunta.setRespuestas(respuestas);
        }
        
        return preguntas;
        
    }
    
    /**
     * Lista todas las preguntas que no se encuentran aprobadas
     * 
     * @return Lista de preguntas no aprobadas
     */
    @GetMapping("noaprobados")
    public List<Pregunta> indexNoAprobados() {
        
        return this.preguntaDAO.findAllByAprobado(false);
        
    }

    /**
     * Permite guardar una pregunta dentro de la base de datos
     *
     * @param pregunta Pregunta que se desea guardar
     * @param principal
     * @return id de la pregunta guardada
     */
    @PostMapping
    public Long store(@RequestBody Pregunta pregunta, Principal principal) {
        // Obtener el objeto del usuario
        Usuario usuario = this.usuarioDAO.findByNombre(principal.getName());

        // Si el usuario existe
        if ( usuario != null ) {
            // Fijar la fecha de la pregunta
            pregunta.setCreatedAt(Timestamp.from(Instant.now()));
            pregunta.setUsuario(usuario);

            // Guardar la pregunta
            this.preguntaDAO.save(pregunta);
            
            return pregunta.getId();
        }

        return null;

    }

    /**
     * Permite obtener la pregunta asosiada a un id
     *
     * @param id id de la pregunta
     * @return
     */
    @GetMapping("{id}")
    public Pregunta show(@PathVariable("id") long id) {

        return this.preguntaDAO.findById(id).get();

    }
    
    /**
     * Permite actualizar una pregunta
     * 
     * @param id id de la pregunta
     */
    @GetMapping("aprobar/{id}")
    public void update(@PathVariable("id") long id) {
        // Obtener pregunta
        Pregunta pregunta = this.preguntaDAO.findById(id).get();
        
        // Validar pregunta
        if ( pregunta != null ) {
            // Aprobar
            pregunta.setAprobado(true);
            
            // Guardar
            this.preguntaDAO.save(pregunta);
        }
    }

    /**
     * Eliminar una pregunta de la base de datos
     *
     * @param id id de la pregunta que se desea eliminar
     */
    @DeleteMapping("{id}")
    public void destroy(@PathVariable("id") long id) {
        
        this.preguntaDAO.deleteById(id);

    }

}
