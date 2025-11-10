package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControladorREST {
	
	private static final String MENSAJE1 = "Hola Mundo con REST en Spring Boot 1";
	private static final String MENSAJE2 = "Hola Mundo con REST en Spring Boot 2";
	private static final String MENSAJE3 = "Hola Mundo con REST en Spring Boot 3";
	private static final String MENSAJE4 = "Hola Mundo con REST en Spring Boot 4";

    @GetMapping("/hello")
    public String saludar() {
        return MENSAJE1;
    }
    
    @GetMapping("/hello2")
    public String saludar2() {
    	return MENSAJE2;
    }
    
    @GetMapping("/hello3")
    public String saludar3() {
    	return MENSAJE3;
    }
    
    @GetMapping("/hello4")
    public String saludar4() {
    	return MENSAJE4;
    }
}
