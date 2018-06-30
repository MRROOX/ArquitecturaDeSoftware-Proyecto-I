/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aqct.backend.controller;

import aqct.backend.jwt.UserRepository;
import java.security.Principal;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import model.Pregunta;
import model.PreguntaDAO;
import model.Usuario;
import org.orm.PersistentException;
import org.springframework.security.access.prepost.PreAuthorize;
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
@PreAuthorize("true")
@RequestMapping("pregunta")
public class PreguntaController {

    /**
     * Lista todas las preguntas que se encuentran en la base de datos del
     * sistema
     *
     * @return Lista con las preguntas
     * @throws org.orm.PersistentException
     */
    @GetMapping
    public List<Pregunta> index() throws PersistentException {

        return Arrays.asList(PreguntaDAO.listPreguntaByQuery(null, null));

    }

    /**
     * Permite guardar una pregunta dentro de la base de datos
     *
     * @param pregunta Pregunta que se desea guardar
     * @param principal
     * @return id de la pregunta guardada
     * @throws PersistentException
     */
    @PostMapping
    public Integer store(@RequestBody Pregunta pregunta, Principal principal) throws PersistentException {
        // Obtener el objeto del usuario
        Usuario usuario = UserRepository.findByUsername(principal.getName());

        // Si el usuario existe
        if ( usuario != null ) {
            // Fijar la fecha de la pregunta
            pregunta.setCreated_at(Timestamp.from(Instant.now()));

            // Guardar la pregunta
            if (PreguntaDAO.save(pregunta)) {
                return pregunta.getId();
            }
        }

        return null;

    }

    /**
     * Permite obtener la pregunta asosiada a un id
     *
     * @param id id de la pregunta
     * @return
     * @throws PersistentException
     */
    @GetMapping("{id}")
    public Pregunta show(@PathVariable("id") int id) throws PersistentException {

        return PreguntaDAO.getPreguntaByORMID(id);

    }

    /**
     * Eliminar una pregunta de la base de datos
     *
     * @param id id de la pregunta que se desea eliminar
     * @throws PersistentException
     */
    @DeleteMapping("{id}")
    public void destroy(@PathVariable("id") int id) throws PersistentException {

        Pregunta pregunta = PreguntaDAO.getPreguntaByORMID(id);
        PreguntaDAO.delete(pregunta);

    }

}
