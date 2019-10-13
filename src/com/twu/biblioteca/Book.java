package com.twu.biblioteca;

import java.util.Scanner;

public class Book {
    public String title;
    public String author;
    public int year;
    public boolean checkedOut;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.checkedOut = false;
    }

    public String getTitle() {

        return title;
    }

    public String getAuthor() {

        return author;
    }

    public int getYear() {

        return year;
    }

    public boolean isCheckedOut() {
        return this.checkedOut;
    }

    public boolean checkOut() {
        this.checkedOut = true;
        return this.checkedOut;
    }

    public boolean checkIn(){
        this.checkedOut = false;
        return this.checkedOut;
    }

    public boolean matchTitle(String userInput) {
        if (userInput.equals(this.getTitle())) {
            return true;
        }else {
            return false;
        }
    }

    public void print() {
        System.out.printf("%30s %-50.50s %-20s %-5.5s%n", this.isCheckedOut(), this.getTitle(), this.getAuthor(), this.getYear());
    }
}
