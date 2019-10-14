package com.twu.biblioteca;

import org.junit.Test;

public class MovieListTest {
    @Test
    public void MovieList () {
        MovieList movieList = new MovieList();

        assertTrue(movieList instanceof MovieList);
    }
}
