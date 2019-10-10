package com.twu.biblioteca;

public class Book {
    public String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void print() {
        System.out.println(this.getTitle());
    }
}
