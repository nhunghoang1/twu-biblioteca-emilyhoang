package com.twu.biblioteca;

public class Menu {
    public static void reader() {
        System.out.println("Please choose an option!");
        System.out.println("1 - List of books");
    }

    public void chooseOptions(int line) {
        if (line == 1) {
            BookList bookList = new BookList();
            bookList.printBookList();
        }
        else {
            System.out.println("Please select a valid option!");
        }
    }
}
