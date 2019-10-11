package com.twu.biblioteca;

import java.util.Scanner;
import java.util.ArrayList;

public class Menu {
    public static void reader() {
        System.out.println("Please choose an option!");
        System.out.println("1 - List of books");
        System.out.println("2 - Check out a book");
        System.out.println("0 - Quit");
    }

    public void chooseOptions(int line) {
        if (line == 1) {
            BookList bookList = new BookList();
            bookList.printBookList();
        }else if (line == 2) {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Please enter a book tittle");

            String userInput = myObj.nextLine();
            BookList bookList = new BookList();
            boolean foundBook = false;

            for(int index = 0; index < bookList.bookList.size(); index++) {
                if (bookList.bookList.get(index).matchTitle(userInput)) {
                    System.out.println("Thank you! Enjoy the book");
                    foundBook = true;
                    break;
                }
            }
            if (foundBook == false) {
                System.out.println("Sorry, that book is not available");
            }
        }
        else if (line == 0) {
            // the application will quit
        }
        else {
            System.out.println("Please select a valid option!");
        }
    }
}
