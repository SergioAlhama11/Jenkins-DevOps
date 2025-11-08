package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControladorREST {
	
	private static final String MENSAJE = "Hola Mundo con REST en Spring Boot";

    @GetMapping("/hello")
    public String saludar() {
        return MENSAJE;
    }
    
    @GetMapping("/hello2")
    public String saludar2() {
    	return MENSAJE;
    }
    
    @GetMapping("/hello3")
    public String saludar3() {
    	return MENSAJE;
    }
}
