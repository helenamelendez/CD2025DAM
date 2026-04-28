package com.example;


/**
 * Clase que gestiona las notas dun alumno.
 * @author A25HelenaMS
 */
public class XestorNotas {

    /** Nombre del alumno */
    private String alumno;

    /** Array de notas delm alumno */
    private double[] notas;

    /**
     * Constructor por defecto.
     */
    public XestorNotas() {
        this.alumno = "Anonimo";
        this.notas = new double[0];
    }

    /**
     * Constructor con parámetros.
     */
    public XestorNotas(String alumno, double[] notas) {
        this.alumno = alumno;
        this.notas = notas;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }


    /**
     * Calcula la media de las notas.
     *
     * @return media de las notas o 0 si no hay notas
     */
    public double calcularMedia() {
        if (notas.length == 0) {
            return 0;
        }

        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }

        return suma / notas.length;
    }


    /**
     * Calcula la nota máxima.
     *
     * @return nota mas alta o 0 si no hay notas
     */
    public double calcularMaximo() {
        if (notas.length == 0) {
            return 0;
        }

        double max = notas[0];
        for (double nota : notas) {
            if (nota > max) {
                max = nota;
            }
        }

        return max;
    }


    /**
     * Indica si el alumno está aprobado.
     *
     * @return true si la media es mayor o igual a 5, false en caso contrario
     */
    public boolean estaAprobado() {
        return calcularMedia() >= 5;
    }

    /**
     * Cuenta el número de suspensos.
     *
     * @return número de notas inferiores a 5
     */
    public int contarSuspensos() {
        int contador = 0;
        for (double nota : notas) {
            if (nota < 5) {
                contador++;
            }
        }
        return contador;
    }
}