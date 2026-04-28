package com.example;
import static org.junit.jupiter.api.Assertions.*;
import java.lang.reflect.Array;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class UserTest {
      @Test
    void testConstructor(){
        User UserTest = new User("01", "Helena");
        assertEquals("01", UserTest.getId());
        assertEquals("Helena", UserTest.getName());
        assertTrue(UserTest.getLoans().isEmpty());
    }

        @Test
    void testAddLoans(){
        Book BookTest = new Book("001", "Guideon la novena");
        User UserTest = new User("01", "Helena");
        assertTrue(UserTest.getLoans().isEmpty());
        Loan loanTest = new Loan(BookTest, UserTest);
        UserTest.addLoan(loanTest);
        assertFalse(UserTest.getLoans().isEmpty());
        assertEquals(1, UserTest.getLoans().size());
        UserTest.addLoan(loanTest);
        assertEquals(2, UserTest.getLoans().size());
        UserTest.addLoan(loanTest);
        assertThrows(IllegalStateException.class, () -> {UserTest.addLoan(loanTest);});
    }


        @Test
    void testRemoveLoans(){
        Book BookTest = new Book("001", "Guideon la novena");
        User UserTest = new User("01", "Helena");
        assertTrue(UserTest.getLoans().isEmpty());
        Loan loanTest = new Loan(BookTest, UserTest);
        UserTest.addLoan(loanTest);
        assertFalse(UserTest.getLoans().isEmpty());
        assertEquals(1, UserTest.getLoans().size());
        UserTest.removeLoan(loanTest);
        assertTrue(UserTest.getLoans().isEmpty());
        assertEquals(0, UserTest.getLoans().size());
    }


}
