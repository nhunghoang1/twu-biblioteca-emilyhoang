package com.twu.biblioteca;

import java.util.Scanner;
import java.util.ArrayList;

public class Menu {
    BookList bookList;

    public Menu() {
        this.bookList = new BookList();
    }

    public void printOptions() {
        this.clearScreen();
        System.out.println("Please choose an option!");
        System.out.println("0 - Quit");
        System.out.println("1 - List of books");
        System.out.println("2 - Check out a book");
        System.out.println("3 - Return a book");
    }

    public void chooseOptions(int line) {
        if (line == 1) {
            this.bookList.printBookList();
        }else if (line == 2) {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Please enter a book tittle");

            String userInput = myObj.nextLine();
            boolean foundBook = false;

            for(int index = 0; index < this.bookList.bookList.size(); index++) {
                if (this.bookList.bookList.get(index).matchTitle(userInput)) {
                    this.bookList.bookList.get(index).checkOut();

                    System.out.println("Thank you! Enjoy the book");
                    foundBook = true;
                    break;
                }
            }
            if (foundBook == false) {
                System.out.println("Sorry, that book is not available");
            }
        }else if ( line == 3) {
            System.out.println("Please select the book you want to return!");

            Scanner myObj = new Scanner(System.in);
            String userInput = myObj.nextLine();

            for(int index = 0; index < this.bookList.bookList.size(); index++) {
                if (this.bookList.bookList.get(index).matchTitle(userInput)) {
                    this.bookList.bookList.get(index).checkIn();

                    System.out.println("Thank you for returning the book.");

                    break;
                }
            }
        } else if (line == 0) {
            // the application will quit
        }
        else {
            System.out.println("Please select a valid option!");
        }
    }

    private void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}

