package com.twu.biblioteca;
import java.util.ArrayList;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");

        BookList bookList = new BookList();
        Book book1 = new Book("Learn to program", "Chris", 2000);
        Book book2 = new Book("Ruby", "Pattrick asdfasd", 2009);
        Book book3 = new Book("Java", "Kat", 2005);

        bookList.addBook(book1);
        bookList.addBook(book2);
        bookList.addBook(book3);

        bookList.printBookList();
    }
}
