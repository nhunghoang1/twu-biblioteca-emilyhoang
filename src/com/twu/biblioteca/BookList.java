package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;


public class BookList {
    ArrayList<Book> bookList;

    public BookList() {
        this.bookList = new ArrayList<Book>();
    }

    public ArrayList addBook(Book book) {
        this.bookList.add(book);
        return this.bookList;
    }

    public void printBookList() {
        for(Book book : this.bookList) {
            book.print();
        }
    }
}
