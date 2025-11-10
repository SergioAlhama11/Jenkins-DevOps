package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// Tests para la clase ControladorRest
public class ControladorRESTTest {
	
	private ControladorREST controlador;

    @BeforeEach
    void setUp() {
        controlador = new ControladorREST();
    }

    @Test
    void testSaludar() {
        String resultado = controlador.saludar();
        assertEquals("Hola Mundo con REST en Spring Boot 1", resultado);
    }

    @Test
    void testSaludar2() {
        String resultado = controlador.saludar2();
        assertEquals("Hola Mundo con REST en Spring Boot 2", resultado);
    }

    @Test
    void testSaludar3() {
        String resultado = controlador.saludar3();
        assertEquals("Hola Mundo con REST en Spring Boot 3", resultado);
    }

}
