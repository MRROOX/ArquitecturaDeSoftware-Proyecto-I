/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aqct.backend.controller;

import aqct.backend.model.Medida;
import aqct.backend.model.MedidaDAO;
import aqct.backend.model.Range;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
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
@RequestMapping("medida")
@Secured("IS_AUTHENTICATED_FULLY")
public class MedidaController {

    @Autowired
    private MedidaDAO medidaDAO;

    @GetMapping
    public List<Medida> index() {

        return this.medidaDAO.findAll();

    }

    @PostMapping("range")
    public List<Medida> indexOf(@RequestBody Range rango) {
        return this.medidaDAO.findByCreatedAtBetween(rango.getFrom(), rango.getTo());
        
    }

    @PostMapping
    public Long store(@RequestBody Medida medida) {

        this.medidaDAO.save(medida);

        return medida.getId();

    }

    @GetMapping("{id}")
    public Medida show(@PathVariable("id") long id) {

        return this.medidaDAO.findById(id).get();

    }

}
