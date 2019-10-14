package com.twu.biblioteca;

import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MovieTest {
    @Test
    public void getName() {
        Movie movie = new Movie("12 years a slave", 2014, "Steve McQueen", 8);

        assertEquals("12 year a slave", movie.getName());
    }

    @Test
    public void getYear() {
        Movie movie = new Movie("12 years a slave", 2014, "Steve McQueen", 8);

        assertEquals(2014, movie.getYear());
    }

    @Test
    public void getDirector() {
        Movie movie = new Movie("12 years a slave", 2014, "Steve McQueen", 8);

        assertEquals("Steve McQueen", movie.getDirector());
    }

    @Test
    public void getRating() {
        Movie movie = new Movie("12 years a slave", 2014, "Steve McQueen", 8);

        assertEquals(8, movie.getRating());
    }

    @Test
    public void print() {
        Movie movie = new Movie("12 years a slave", 2014, "Steve McQueen", 8);

        PrintStream expectedResult = System.out.printf("%-50.50s %-20s %-5.5s%n", movie.getName(), movie.getYear(), movie.getDirector(), movie.getRating());
        assertEquals(2014, movie.print());
    }
}