

package aqct.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class RespuestaController {
    
    @GetMapping("/respuesta")
    public String index(){
        return "holam";
    }
    
}
