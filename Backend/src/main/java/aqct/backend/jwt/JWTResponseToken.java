package aqct.backend.jwt;

import aqct.backend.model.Usuario;

public class JWTResponseToken extends JWTResponse {
    
    private final String token;
    
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties({"preguntas"})
    private final Usuario usuario;
    
    public JWTResponseToken(String token, Usuario usuario) {
        
        this.token = token;
        this.usuario = usuario;
        
    }
    
    public String getToken() {
        
        return this.token;
        
    }
    
    public Usuario getUsuario() {
        
        return this.usuario;
        
    }
    
}
