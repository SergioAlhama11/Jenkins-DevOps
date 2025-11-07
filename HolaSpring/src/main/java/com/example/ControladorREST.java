package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @GetMapping("/hello")
    public String saludar() {
        return "Hola Mundo con REST en Spring Boot";
    }
    
    @GetMapping("/hello2")
    public String saludar2() {
    	return "Hola Mundo con REST en Spring Boot";
    }
    
    @GetMapping("/hello3")
    public String saludar3() {
    	return "Hola Mundo con REST en Spring Boot";
    }
}
