package com.twu.biblioteca;

import java.util.ArrayList;


public class BookList {
    ArrayList<Book> bookList;

    public BookList() {
        this.bookList = new ArrayList<Book>();

        Book book1 = new Book("Learn to program", "Chris", 2000);
        Book book2 = new Book("Ruby", "Patrick", 2009);
        Book book3 = new Book("Java", "Kat", 2005);

        this.bookList.add(book1);
        this.bookList.add(book2);
        this.bookList.add(book3);
    }

    public void getCheckedOutBooks() {
        for(Book book : this.bookList) {
            if (book.isCheckedOut()) {
                book.print();
            }
        }
    }

    public void printBookList() {
        for(Book book : this.bookList) {
            if(!book.isCheckedOut()) {
                book.print();
            }
        }
    }
}

