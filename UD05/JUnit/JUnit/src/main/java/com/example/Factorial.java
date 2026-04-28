package com.example;

import java.math.BigInteger;

/**Clase Factorial
 * @author A25HelenaMS
 */
public class Factorial {

    /**
     * Funcion factorial
     * Calcula el factorial de un numero recibido por parametro
     * @param n Numero a calcular
     * @return  Numero BigInteger resultado del calculo
     * @throws Exception Excepción que se lanza cuando el numero recibido por parametro es inferior a cero
     */
    public BigInteger factorial(int n) throws Exception {
        if (n < 0) {
            throw new Exception("Error. El número tiene que ser >=0");
        }

        BigInteger resultado = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            resultado = resultado.multiply(BigInteger.valueOf(i));
        }

        return resultado;
    }
}