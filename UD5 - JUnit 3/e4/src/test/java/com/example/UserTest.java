package com.example;
import static org.junit.jupiter.api.Assertions.*;
import java.lang.reflect.Array;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class UserTest {
      @Test
    void testConstructor(){
        User userTest = new User("01", "Helena");
        assertEquals("01", userTest.getId());
        assertEquals("Helena", userTest.getName());
        assertTrue(userTest.getLoans().isEmpty());
    }

        @Test
    void testAddLoans(){
        Book bookTest = new Book("001", "Guideon la novena");
        User userTest = new User("01", "Helena");
        assertTrue(userTest.getLoans().isEmpty());
        Loan loanTest = new Loan(bookTest, userTest);
        userTest.addLoan(loanTest);
        assertFalse(userTest.getLoans().isEmpty());
        assertEquals(1, userTest.getLoans().size());
        userTest.addLoan(loanTest);
        assertEquals(2, userTest.getLoans().size());
        userTest.addLoan(loanTest);
        assertThrows(IllegalStateException.class, () -> {userTest.addLoan(loanTest);});
    }


        @Test
    void testRemoveLoans(){
        Book bookTest = new Book("001", "Guideon la novena");
        User userTest = new User("01", "Helena");
        assertTrue(userTest.getLoans().isEmpty());
        Loan loanTest = new Loan(bookTest, userTest);
        userTest.addLoan(loanTest);
        assertFalse(userTest.getLoans().isEmpty());
        assertEquals(1, userTest.getLoans().size());
        userTest.removeLoan(loanTest);
        assertTrue(userTest.getLoans().isEmpty());
        assertEquals(0, userTest.getLoans().size());
    }


}
