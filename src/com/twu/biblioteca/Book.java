package com.twu.biblioteca;

public class Book {
    public String title;
    public String author;
    public int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTittle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void print() {
        System.out.printf("%-50.50s %-20s %-5.5s%n", this.getTittle(), this.getAuthor(), this.getYear());
    }
}
