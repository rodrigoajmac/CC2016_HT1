package com.grupo8;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class LicuadoraFuncionalTest {
    private LicuadoraFuncional licuadora;

    @Before
    public void setUp() {
        licuadora = new LicuadoraFuncional();
    }

    @Test
    public void testEncender() {
        licuadora.encender();
        assertTrue(licuadora.estaEncendida());
        assertEquals(0, licuadora.consultarVelocidad());
    }

    @Test
    public void testApagar() {
        licuadora.encender();
        licuadora.apagar();
        assertFalse(licuadora.estaEncendida());
        assertEquals(0, licuadora.consultarVelocidad());
    }

    @Test
    public void testLlenar() {
        licuadora.llenar(1.5);
        assertEquals(1.5, licuadora.llenar(0), 0.01);  // La licuadora debe tener 1.5L
    }

    @Test
    public void testNoSobrepasaCapacidadMaxima() {
        licuadora.llenar(3.0);  // Intenta llenar con 3L pero la capacidad es 2L
        assertEquals(2.0, licuadora.llenar(0), 0.01);
    }

    @Test
    public void testIncrementarVelocidad() {
        licuadora.encender();
        licuadora.incrementarVelocidad();
        assertEquals(1, licuadora.consultarVelocidad());
    }

    @Test
    public void testNoSobrepasaVelocidadMaxima() {
        licuadora.encender();
        for (int i = 0; i < 5; i++) {
            licuadora.incrementarVelocidad();
        }
        assertEquals(4, licuadora.consultarVelocidad());
    }

    @Test
    public void testDecrementarVelocidad() {
        licuadora.encender();
        licuadora.incrementarVelocidad();
        licuadora.decrementarVelocidad();
        assertEquals(0, licuadora.consultarVelocidad());
    }

    @Test
    public void testVaciar() {
        licuadora.llenar(1.0);
        licuadora.vaciar();
        assertEquals(0, licuadora.llenar(0), 0.01);
    }

    @Test
    public void testServir() {
        licuadora.llenar(1.5);
        licuadora.servir(0.5);
        assertEquals(1.0, licuadora.llenar(0), 0.01);
    }

    @Test
    public void testNoSirveMasDeLoQueTiene() {
        licuadora.llenar(0.5);
        licuadora.servir(1.0);
        assertEquals(0.0, licuadora.llenar(0), 0.01);
    }
}