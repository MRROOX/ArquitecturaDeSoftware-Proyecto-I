package aqct.backend.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PreAuthorize("true")
//@Secured("IS_AUTHENTICATED_FULLY")
public class RespuestaController {
    
    @GetMapping("respuesta/{id}")
    public String index(@PathVariable("id") Integer id){
        return "holam "+id;
    }
    
}
