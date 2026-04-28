package com.example;

/**
 * Clase que almancena la informacion de un libro en una biblioteca
 * @author A25HelenaMS
 */
public class Book {

    /** Codigo isbn */
    private String isbn;
    /** Titulo del libro */
    private String title;
    /** Disponibilidad del libro */
    private boolean available;


    /**
     * Constructor con parámetros.
     * @param isbn Asigana el isbn
     * @param title Asigan el titulo del libro
     * establece la disponibilidad por defecto a true
     */
    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
        this.available = true;
    }

    /**
     * Devuelve el isbn del libro
     * @return String isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Devuelve el titulo del libro
     * @return String titulo
     */
    public String getTitle() {
        return title;
    }

    /**
     * Devuelve la disponibilidad del libro
     * @return Boolean avaliable
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * si la disponibilidad es True
     * establece la disponibilidad a false
     * en caso contrario
     * lanza una exepcion 
     */
    public void borrow() {
        if (!available) {
            throw new IllegalStateException("Book not available");
        }
        available = false;
    }

    /**
     * establece la disponibilidad a true
     */
    public void giveBack() {
        available = true;
    }
}