package com.example;

import java.math.BigInteger;

/**Clase Fibonacci
 * @author A25HelenaMS
 */
public class Fibonacci {

    /**
     * Funcion fibonacci
     * Calcula la progrecion de fibonacci de un numero recibido por parametro
     * @param n Numero a calcular
     * @return Numero BigInteger resultado del calculo
     * @throws Exception Excepción que se lanza cuando el numero recibido por parametro es inferior a cero
     */
    public BigInteger fibonacci(int n) throws Exception {
        if (n < 0) {
            throw new Exception("Error. El número tiene que ser >=0");
        }

        if (n == 0) {
            return BigInteger.ZERO;
        }

        if (n == 1) {
            return BigInteger.ONE;
        }

        BigInteger anterior = BigInteger.ZERO;
        BigInteger actual = BigInteger.ONE;
        BigInteger resultado = BigInteger.ZERO;

        for (int i = 2; i <= n; i++) {
            resultado = anterior.add(actual);
            anterior = actual;
            actual = resultado;
        }

        return actual;
    }
}