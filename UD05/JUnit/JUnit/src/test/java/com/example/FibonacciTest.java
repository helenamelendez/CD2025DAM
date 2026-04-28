package com.example;

import org.junit.jupiter.api.Test;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;


public class FibonacciTest {

    @Test
    void fibonacciDeNegativo() throws Exception {
        Fibonacci f = new Fibonacci();

         Exception exception = assertThrows(Exception.class, () -> {
            f.fibonacci(-1);
        });

        assertEquals("Error. El número tiene que ser >=0", exception.getMessage());
    }

    @Test
    void fibonacciDeCero() throws Exception {
        Fibonacci f = new Fibonacci();
        assertEquals(BigInteger.ZERO, f.fibonacci(0));
    }

    @Test
    void fibonacciDeUno() throws Exception {
        Fibonacci f = new Fibonacci();
        assertEquals(BigInteger.ONE, f.fibonacci(1));
    }

    @Test
    void fibonacciDeDiez() throws Exception {
        Fibonacci f = new Fibonacci();
        assertEquals(BigInteger.valueOf(55), f.fibonacci(10));
    }

    @Test
    void fibonacciDeNumeroGrande() throws Exception {
        Fibonacci f = new Fibonacci();
        assertEquals(BigInteger.valueOf(433494437), f.fibonacci(43));
    }

}
