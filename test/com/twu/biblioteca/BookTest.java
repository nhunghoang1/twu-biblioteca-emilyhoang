package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
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

    @Test
    public void checkIn() {
        Book book = new Book("Learn to program", "Chris", 2000);

        assertEquals(false, book.checkIn() );
    }

    @Test
    public void testMatchTitleForMatchingTitle() {
        Book book = new Book("Learn to program", "Chris", 2000);
        String userInput = "Learn to program";

        assertEquals(true, book.matchTitle(userInput));
    }

    @Test
    public void tesMatchTitleForUnMatchingTtile() {
        Book book = new Book("Learn to program", "Chris", 2000);
        String userInput = "Ruby";

        assertEquals(false, book.matchTitle(userInput));
    }

    @Test
    public void print() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Book book = new Book("Learn to program", "Chris", 2000);

        PrintStream expectedResult = System.out.printf("%-50.50s %-20s %-5.5s%n", book.getTitle(), book.getAuthor(), book.getYear());


        assertThat(expectedResult, is(equalTo(book.print())));
    }
}
