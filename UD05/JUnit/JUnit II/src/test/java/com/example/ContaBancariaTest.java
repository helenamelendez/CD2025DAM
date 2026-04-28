package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ContaBancariaTest {

    @Test
    void testConstructorPorDefecto() {
        ContaBancaria cuentaTest = new ContaBancaria();
        assertEquals("Descoñecido", cuentaTest.getTitular());
        assertEquals(0.0, cuentaTest.getSaldo());
        assertEquals(0, cuentaTest.getNumeroOperacions());
    }

    @Test
    void testConstructorConParametros(){
        ContaBancaria cuentaTest = new ContaBancaria("Helena", 200.0);
        assertEquals("Helena", cuentaTest.getTitular());
        assertEquals(200.0, cuentaTest.getSaldo());
        assertEquals(0, cuentaTest.getNumeroOperacions());
    }

    @Test
    void testSetter(){
        ContaBancaria cuentaTest = new ContaBancaria();
        cuentaTest.setTitular("Ana");
        assertEquals("Ana", cuentaTest.getTitular());
    }


    @Test
    void testIngresar(){
        ContaBancaria cuentaTest = new ContaBancaria();
        cuentaTest.ingresar(-52.0);
        assertEquals(0.0, cuentaTest.getSaldo());
        cuentaTest.ingresar(50.0);
        assertEquals(50.0, cuentaTest.getSaldo());
        assertEquals(1, cuentaTest.getNumeroOperacions());
        cuentaTest.ingresar(50.0);
        assertEquals(100.0, cuentaTest.getSaldo());
        assertEquals(2, cuentaTest.getNumeroOperacions());
    }
    
    @Test
    void testRetirar(){
        ContaBancaria cuentaTest = new ContaBancaria("Helena", 50.0);
        assertFalse(cuentaTest.retirar(-40.0));
        assertFalse(cuentaTest.retirar(60.0));
        assertTrue(cuentaTest.retirar(40.0));
        assertEquals(10.0, cuentaTest.getSaldo());
        assertEquals(1, cuentaTest.getNumeroOperacions());
    }

    @Test
    void testCalcularComision(){
        ContaBancaria cuentaTest = new ContaBancaria();
        assertEquals(0, cuentaTest.calcularComision());
        for (int i = 0; i < 5; i++) {
            cuentaTest.ingresar(10.0);
        }
        assertEquals(50.0, cuentaTest.getSaldo());
        assertEquals(0.5, cuentaTest.calcularComision());
        for (int i = 0; i < 6; i++) {
            cuentaTest.ingresar(10.0);
        }
        assertEquals(110.0, cuentaTest.getSaldo());
        assertEquals(2.2, cuentaTest.calcularComision());
    }

    @Test
    void testAplicarComision(){
        ContaBancaria cuentaTest = new ContaBancaria();
        for (int i = 0; i < 11; i++) {
            cuentaTest.ingresar(10.0);
        }
        cuentaTest.aplicarComision();
        assertEquals(107.8, cuentaTest.getSaldo());
        

    }

}
