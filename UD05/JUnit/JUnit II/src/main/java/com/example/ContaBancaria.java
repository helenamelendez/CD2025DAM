package com.example;


/**
 * Clase que representa una conta bancaria.
 * @author A25HelenaMS
 */
public class ContaBancaria {

    /** Nombre del titular de la cuenta */
    private String titular;

    /** Saldo actual de la cuenta */
    private double saldo;

    /** Número total de operaciones realizadas */
    private int numeroOperacions;

    /**
     * Constructor por defecto.
     */
    public ContaBancaria() {
        this.titular = "Descoñecido";
        this.saldo = 0.0;
        this.numeroOperacions = 0;
    }

    /**
     * Constructor con parámetros.
     */
    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.numeroOperacions = 0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroOperacions() {
        return numeroOperacions;
    }


    /**
     * Ingresa una cantidade de dinero.
     *
     * @param cantidade cantidad a ingresar (debe ser mayor que 0)
     */
    public void ingresar(double cantidade) {
        if (cantidade > 0) {
            saldo += cantidade;
            numeroOperacions++;
        }
    }

    /**
     * Retira una cantidad de dinero.
     *
     * @param cantidade cantidad a retirar (debe ser mayor que 0 y menor o igual al saldo)
     * @return true si la operación se realiza correctamente, false en caso contrario
     */
    public boolean retirar(double cantidade) {
        if (cantidade > 0 && saldo >= cantidade) {
            saldo -= cantidade;
            numeroOperacions++;
            return true;
        }
        return false;
    }

     /**
     * Calcula la comisión en función del número de operaciones.
     *
     * @return comisión a aplicar
     */
    public double calcularComision() {
        if (numeroOperacions < 5) {
            return 0;
        } else if (numeroOperacions <= 10) {
            return saldo * 0.01;
        } else {
            return saldo * 0.02;
        }
    }

    /**
     * Aplica la comisión al saldo de la cuenta.
     */
    public void aplicarComision() {
        double comision = calcularComision();
        saldo -= comision;
    }
}