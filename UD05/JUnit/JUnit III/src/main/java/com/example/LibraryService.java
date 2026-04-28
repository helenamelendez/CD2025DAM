package com.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Clase que se encarga de integra la logica de Libro, Usuario y Prestamos
 * @author A25HelenaMS
 */
public class LibraryService {

    /** Registro de lo libros */
    private Map<String, Book> books = new HashMap<>();
    /** Registro de los usuarios */
    private Map<String, User> users = new HashMap<>();

    /**
     * Añade un libro al registro de la biblioteca
     * @param book Libro pasado por parametro
     * Lanza una excepción cuando se intenta añadir un libro ya existente en el registro
     */
    public void addBook(Book book) {
        if (books.containsKey(book.getIsbn())) {
            throw new IllegalArgumentException("Book already exists");
        }
        books.put(book.getIsbn(), book);
    }

    /**
     * Añade un usuario al registro de la biblioteca
     * @param user Usuaro pasado por paremetro
     * Lanza una excepción cuando se intenta añadir un usuario ya existente en el registro
     */
    public void addUser(User user) {
        if (users.containsKey(user.getId())) {
            throw new IllegalArgumentException("User already exists");
        }
        users.put(user.getId(), user);
    }

    /**
     * Realiza un prestamos, integrando las clases libro, usuario y prestamo
     * @param isbn parametro String del isbn del libro que sera prestado
     * @param userId parametro String del userId del usuario que realiza el prestamo
     * @return devuelve el objeto prestmo realizado
     * Lanza una excepción cuando la informacion recibida no coincide con algun item en el registro
     */
    public Loan borrowBook(String isbn, String userId) {
        Book book = books.get(isbn);
        User user = users.get(userId);

        if (book == null || user == null) {
            throw new IllegalArgumentException("Invalid data");
        }

        book.borrow();

        Loan loan = new Loan(book, user);
        user.addLoan(loan);

        return loan;
    }

    /**
     * Realiza una devolucion, integrando las clases libro, usuario y prestamo
     * @param loan Parametro del prestamo a devolver
     * lanza una excepción cuando el prestamo ya no esta activo
     */
    public void returnBook(Loan loan) {
        if (!loan.isActive()) {
            throw new IllegalStateException("Loan already closed");
        }

        loan.closeLoan();
        loan.getBook().giveBack();
        loan.getUser().removeLoan(loan);
    }
}