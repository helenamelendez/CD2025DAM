package com.example;
import static org.junit.jupiter.api.Assertions.*;
import java.lang.reflect.Array;
import org.junit.jupiter.api.Test;


public class BookTest {

    @Test
    void testConstructor(){
        Book bookTest = new Book("001", "Guideon la novena");
        assertEquals("001", bookTest.getIsbn());
        assertEquals("Guideon la novena", bookTest.getTitle());
        assertEquals(true, bookTest.isAvailable());

    }

    @Test
    void testBorrow(){
        Book bookTest = new Book("001", "Guideon la novena");
        bookTest.borrow();
        assertFalse(bookTest.isAvailable());
        assertThrows(IllegalStateException.class, () -> {bookTest.borrow();});
        
    }

    @Test
    void testGiveBack(){
        Book bookTest = new Book("001", "Guideon la novena");
        bookTest.borrow();
        assertFalse(bookTest.isAvailable());
        bookTest.giveBack();
        assertTrue(bookTest.isAvailable());
    }




    
}
