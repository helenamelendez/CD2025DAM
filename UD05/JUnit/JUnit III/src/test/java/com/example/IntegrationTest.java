package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryServiceIntegrationTest {

    @Test
    void shouldBorrowBookCorrectly() {
        LibraryService service = new LibraryService();

        Book book = new Book("123", "Clean Code");
        User user = new User("u1", "Ana");

        service.addBook(book);
        service.addUser(user);

        Loan loan = service.borrowBook("123", "u1");

        assertNotNull(loan);
        assertEquals(book, loan.getBook());
        assertEquals(user, loan.getUser());
        assertFalse(book.isAvailable());
        assertEquals(1, user.getLoans().size());
        assertTrue(user.getLoans().contains(loan));
        assertTrue(loan.isActive());

        assertThrows(IllegalArgumentException.class, () -> {service.addBook(book);});
        assertThrows(IllegalArgumentException.class, () -> {service.addUser(user);});
        assertThrows(IllegalArgumentException.class, () -> {service.borrowBook("124", "u2");});
        assertThrows(IllegalArgumentException.class, () -> {service.borrowBook("123", "u2");});
        assertThrows(IllegalArgumentException.class, () -> {service.borrowBook("124", "u1");});

        service.returnBook(loan);
        assertFalse(loan.isActive());
        assertTrue(book.isAvailable());
        assertTrue(user.getLoans().isEmpty());
        assertEquals(0, user.getLoans().size());
        
         assertThrows(IllegalStateException.class, () -> {service.returnBook(loan);});

    }

}