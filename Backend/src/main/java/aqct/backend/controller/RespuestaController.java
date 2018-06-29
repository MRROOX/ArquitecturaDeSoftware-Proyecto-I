

package aqct.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class RespuestaController {
    
    @GetMapping("/respuesta/{id}")
    public String index(@PathVariable("id") String id){
        return "holam "+id;
    }
    
}
