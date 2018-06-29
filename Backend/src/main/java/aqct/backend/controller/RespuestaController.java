package aqct.backend.controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import model.Respuesta;
import model.RespuestaDAO;
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

@RestController
@PreAuthorize("true")
@RequestMapping("respuesta")
//@Secured("IS_AUTHENTICATED_FULLY")
public class RespuestaController {    
    
    @PostMapping
    public Integer store(@RequestBody Respuesta respuesta){
        
        try {
            
            if(RespuestaDAO.save(respuesta)){
                return respuesta.getId();
            }
            
        } catch (PersistentException ex) {
            Logger.getLogger(RespuestaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    @GetMapping("{id}")
    public Respuesta show (@PathVariable("id") Integer id){
        
        try {
            return RespuestaDAO.getRespuestaByORMID(id);
        } catch (PersistentException ex) {
            Logger.getLogger(RespuestaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    @DeleteMapping
    public void destroy(@RequestParam("id") int id){
        
        try {
            Respuesta respuesta = RespuestaDAO.getRespuestaByORMID(id);
            RespuestaDAO.delete(respuesta);
            
        } catch (Exception ex) {
            Logger.getLogger(RespuestaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
