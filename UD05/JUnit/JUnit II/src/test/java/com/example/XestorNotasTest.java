package com.example;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;

import org.junit.jupiter.api.Test;

public class XestorNotasTest {

    @Test
    void testConstructorPorDefecto(){
    XestorNotas notasTest = new XestorNotas();
    assertEquals("Anonimo", notasTest.getAlumno());
    assertArrayEquals(new double[0], notasTest.getNotas());   
    }

    @Test
    void testConstructor(){
    double[] arrayNotas = {5.6,8.3,9.2};
    XestorNotas notasTest = new XestorNotas("Helena", arrayNotas);
    assertEquals("Helena", notasTest.getAlumno());
    assertEquals(5.6, notasTest.getNotas()[0]); 
    assertEquals(8.3, notasTest.getNotas()[1]);   
    assertEquals(9.2, notasTest.getNotas()[2]);   
    }

    @Test
    void testSetters(){
    XestorNotas notasTest = new XestorNotas();
    notasTest.setAlumno("Helena");
    assertEquals("Helena", notasTest.getAlumno());
    double[] arrayNotas = {5.6,8.3,9.2};
    notasTest.setNotas(arrayNotas);
    assertEquals(5.6, notasTest.getNotas()[0]); 
    assertEquals(8.3, notasTest.getNotas()[1]);   
    assertEquals(9.2, notasTest.getNotas()[2]); 
    }

    @Test
    void testCalcularMedia(){
        XestorNotas notasTest = new XestorNotas();
        assertEquals(0.0, notasTest.calcularMedia());
        double[] arrayNotas = {5.6,8.3,9.2};
        notasTest.setNotas(arrayNotas);
        assertEquals(7.7, notasTest.calcularMedia());

    }

    @Test
    void testCalcularMaximo(){
        XestorNotas notasTest = new XestorNotas();
        assertEquals(0.0, notasTest.calcularMaximo());
        double[] arrayNotas = {5.6,8.3,9.2};
        notasTest.setNotas(arrayNotas);
        assertEquals(9.2, notasTest.calcularMaximo());

    }

     @Test
    void testEstaAprobado(){
        XestorNotas notasTest = new XestorNotas();
        double[] arrayNotas = {5.6,8.3,9.2};
        notasTest.setNotas(arrayNotas);
        assertTrue(notasTest.estaAprobado());
        double[] otrasNotas = {3.6,2.3,5.2};
        notasTest.setNotas(otrasNotas);
        assertFalse(notasTest.estaAprobado());
    }

     @Test
    void testContarSuspensos(){
        XestorNotas notasTest = new XestorNotas();
        double[] arrayNotas = {5.6,8.3,9.2};
        notasTest.setNotas(arrayNotas);
        assertEquals(0, notasTest.contarSuspensos());
        double[] otrasNotas = {3.6,2.3,5.2};
        notasTest.setNotas(otrasNotas);
        assertEquals(2, notasTest.contarSuspensos());
    }





}
