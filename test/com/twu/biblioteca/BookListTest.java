package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertTrue;


public class BookListTest {
    @Test
    public void BookList() {
        BookList bookList = new BookList();
        assertTrue(bookList instanceof BookList);
    }

    @Test
    public void addBook() {
        BookList bookList = new BookList();

        Book book = new Book("Learn to Program", "Chris", 2000);

    }
}