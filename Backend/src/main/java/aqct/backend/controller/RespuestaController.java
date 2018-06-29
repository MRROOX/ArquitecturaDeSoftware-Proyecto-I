

package aqct.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController("/respuesta")
public class RespuestaController {
    
    
    
    @GetMapping
    public String index(){
        return "holam";
    }
    
}
