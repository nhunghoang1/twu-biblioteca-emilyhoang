package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void getTitle() {
        Book book = new Book("Learn to program", "Chris", 2000);

        assertEquals("Learn to program", book.getTitle());
    }

    @Test
    public void getAuthor() {
        Book book = new Book("Learn to program", "Chris", 2000);

        assertEquals("Chris", book.getAuthor());
    }

    @Test
    public void getYear() {
        Book book = new Book("Learn to program", "Chris", 2000);

        assertEquals(2000, book.getYear());
    }

    @Test
    public void isCheckedOut() {
        Book book = new Book("Learn to program", "Chris", 2000);

        assertEquals(false, book.isCheckedOut());
    }

    @Test
    public void checkOut() {
        Book book = new Book("Learn to program", "Chris", 2000);

        boolean checkoutResult = book.checkOut();

        assertEquals(true, checkoutResult);
        assertEquals(true, book.isCheckedOut());
    }
}
