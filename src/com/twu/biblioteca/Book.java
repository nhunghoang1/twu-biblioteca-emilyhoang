package com.twu.biblioteca;

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
        if (this.checkedOut) {
            return false;
        }else {
            return true;
        }
    }

    public boolean matchTitle(String userInput) {
        if (userInput.equals(getTitle())) {
            return true;
        } else {
            return false;
        }
    }

    public void print() {
        System.out.printf("%-50.50s %-20s %-5.5s%n", this.getTitle(), this.getAuthor(), this.getYear());
    }
}
