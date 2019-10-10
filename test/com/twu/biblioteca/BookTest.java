package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void BibliotecaApp() {
        Book book = new Book("Harry Potter");
        assertEquals( "Harry Potter", book.getTitle());
    }

}
