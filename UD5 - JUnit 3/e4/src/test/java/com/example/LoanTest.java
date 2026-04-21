package com.example;
import static org.junit.jupiter.api.Assertions.*;
import java.lang.reflect.Array;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class LoanTest {
    
    @Test
    void testConstructor(){
    Book loanBookTest = new Book("001", "Guideon la novena");
    User loanUserTest = new User("01", "Helena");
    Loan loanTest = new Loan(loanBookTest, loanUserTest);
    assertEquals(loanBookTest, loanTest.getBook());
    assertEquals(loanUserTest, loanTest.getUser());
    assertEquals(LocalDate.class, loanTest.getStartDate());
    assertFalse(loanTest.getStartDate() == null);
    }

    @Test
    void testCloseLoan(){
    Book loanBookTest = new Book("001", "Guideon la novena");
    User loanUserTest = new User("01", "Helena");
    Loan loanTest = new Loan(loanBookTest, loanUserTest);
    assertTrue(loanTest.isActive());
    loanTest.closeLoan();
    assertFalse(loanTest.isActive());
    }
    


}
