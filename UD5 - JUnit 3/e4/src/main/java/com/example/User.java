package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que almancena la informacion de un usuario
 * @author A25HelenaMS
 */
public class User {

    /** Codigo Id del usuario */
    private String id;
    /** Nombre del usuario*/
    private String name;
    /** Prestamos Actuales */
    private List<Loan> loans;

    /**
     * Constructor con parametros
     * @param id    Asigna el ID
     * @param name  Asigan el Nombre
     * Establece loans a 0 en la creacion
     */
    public User(String id, String name) {
        this.id = id;
        this.name = name;
        this.loans = new ArrayList<>();
    }

    /**
     * Devuelve el nombre del usuario
     * @return Nombre
     */
    public String getName() {
        return name;
    }
    
    /**
     * Devuelve el id del usuario
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * Devuelve una lista de los prestamos del usuario
     * @return loans
     */
    public List<Loan> getLoans() {
        return loans;
    }

    /**
     * Añade un nuevo prestamo a la lista
     * @param loan recive un parametro prestamos que sea añadido a la lista
     * Si existen 3 o mas prestamos lanza una excepción 
     */
    public void addLoan(Loan loan) {
        if (loans.size() >= 3) {
            throw new IllegalStateException("Max loans reached");
        }
        loans.add(loan);
    }

    /**
     * Remueve un prestamos de la lista
     * @param loan recive un parametro prestamos que sera eliminado de la lista
     */
    public void removeLoan(Loan loan) {
        loans.remove(loan);
    }
}