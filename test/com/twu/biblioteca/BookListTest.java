package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;


public class BookListTest {

    // junit , assertThat, is()
    // mockito, mock
    // shell : z-zsh, fasd
    // zsh-autosuggestions

    // BookController

    // BookService



    @Test
    public void BookList() {
        BookList bookList = new BookList();
        assertTrue(bookList instanceof BookList);
    }

    @Test
    public void printBookList() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        BookList bookList = new BookList();

        Book book1 = new Book("Learn to program", "Chris", 2000);
        book1.checkedOut=true;
        Book book2 = new Book("Ruby", "Patrick", 2009);
        Book book3 = new Book("Java", "Kat", 2005);

        bookList.bookList.add(book1);
        bookList.bookList.add(book2);
        bookList.bookList.add(book3);

        PrintStream expectedResult = System.out.printf("%-50.50s %-20s %-5.5s%n", book2.getTitle(), book2.getAuthor(), book2.getYear(), book3.getTitle(),book3.getAuthor(), book3.getYear());

        bookList.printBookList();
        assertThat(expectedResult.toString(), is(equalTo(outContent.toString())));
    }
}
