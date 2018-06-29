/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aqct.backend.controller;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Pregunta;
import model.PreguntaDAO;
import org.orm.PersistentException;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
     * @return Lista con las preguntas 
     */
    @GetMapping
    public List<Pregunta> index(){
        List<Pregunta> preguntasList = null;
        
        try {
            preguntasList = Arrays.asList(
                    PreguntaDAO.listPreguntaByQuery(null, null));
        } catch (Exception ex) {
            Logger.getLogger(PreguntaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return preguntasList;
                
    }
    
    /**
     * Permite guardar una pregunta dentro de la base de datos
     * @param pregunta Pregunta que se desea guardar
     * @return id de la pregunta guardada
     * @throws PersistentException 
     */
    @PostMapping
    public Integer store(@RequestBody Pregunta pregunta) throws PersistentException{
        
        if (PreguntaDAO.save(pregunta)) {
            return pregunta.getId();
        }
        
        return null;
        
    }
    
    /**
     * Permite obtener la pregunta asosiada a un id
     * @param id id de la pregunta
     * @return 
     * @throws PersistentException 
     */
    @GetMapping("{id}")
    public Pregunta show(@PathVariable int id) throws PersistentException{
        
        return PreguntaDAO.getPreguntaByORMID(id);
        
    }
    
    /**
     * Eliminar una pregunta de la base de datos
     * @param id id de la pregunta que se desea eliminar
     * @throws PersistentException 
     */
    @DeleteMapping
    public void destroy(@RequestParam int id) throws PersistentException{
        
        Pregunta pregunta = PreguntaDAO.getPreguntaByORMID(id);
        PreguntaDAO.delete(pregunta);
        
    }
    
}
