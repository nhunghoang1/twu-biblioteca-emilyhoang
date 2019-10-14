package com.twu.biblioteca;

import java.io.PrintStream;

public class Movie {
    private String name;
    private int year;
    private String director;
    private int rating;

    public Movie(String name, int year, String director, int rating) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }

    public int getRating() {
        return rating;
    }

    public PrintStream print() {
        return System.out.printf("%-50.50s %-20s %-5.5s%n", this.getName(), this.getYear(), this.getDirector(), this.getRating());
    }
}
