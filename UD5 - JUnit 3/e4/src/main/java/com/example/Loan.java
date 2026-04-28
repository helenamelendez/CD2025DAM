package com.example;
import java.time.LocalDate;



/**
 * Clase que almancena la informacion de un prestamo en una biblioteca
 * @author A25HelenaMS
 */
public class Loan {
    /** Libro prestado */
    private Book book;
    /** Usuario que realiza el prestamo */
    private User user;
    /** Fecha del prestamo */
    private LocalDate startDate;
    /** Fecha de devolucion */
    private LocalDate endDate;

    /**
     * Constructor del prestamo
     * @param book Asigna el objeto Libro prestado
     * @param user Asigna el Usuario que realiza el prestamo
     * toma la fecha de creacion para establecer la fecha de inicio
     */
    public Loan(Book book, User user) {
        this.book = book;
        this.user = user;
        this.startDate = LocalDate.now();
    }

    /**
     * Devuelve el objeto libro que fue prestado
     * @return Objeto Libro
     */
    public Book getBook() {
        return book;
    }

    /**
     * Devuelve el objeto usuario que realiza el prestamo
     * @return Objeto usuario
     */
    public User getUser() {
        return user;
    }

    /**
     * Devuelve la fecha de inicio establecida en la creacion
     * @return Devuelve la fecha de inicio
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /**
     * Establece la fecha de ejecucion como la fecha de cierre
     */
    public void closeLoan() {
        this.endDate = LocalDate.now();
    }

    /**
     * Consulata la fecha de cierre
     * @return Devuelve true cuando la fecha de cierre es null, 
     * false en caso contrario
     */
    public boolean isActive() {
        return endDate == null;
    }
}