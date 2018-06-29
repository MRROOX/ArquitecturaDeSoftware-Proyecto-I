/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aqct.backend.controller;

import java.util.Arrays;
import java.util.List;
import model.Medida;
import model.MedidaDAO;
import org.orm.PersistentException;
import org.springframework.security.access.prepost.PreAuthorize;
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
@RequestMapping("medida")
public class MedidaController {
    
    @GetMapping
    public List<Medida> index() throws PersistentException{
        
        return Arrays.asList(
                MedidaDAO.listMedidaByQuery(null, null));
        
    }
    
    @PostMapping
    public Integer store(@RequestBody Medida medida) throws PersistentException{
        
        if(MedidaDAO.save(medida)){
            return medida.getId();
        }
        
        return null;
        
    }
    
    
    @GetMapping("{id}")
    public Medida show(@PathVariable("id") int id) throws PersistentException{
        
        return MedidaDAO.getMedidaByORMID(id);
        
    }
    
}
