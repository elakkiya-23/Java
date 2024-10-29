package com.cloudthat.librarymanagement;

import com.cloudthat.librarymanagement.exceptions.BookAlreadyFoundException;
import com.cloudthat.librarymanagement.exceptions.BookNotFoundException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Library Management System");
        Library library = new Library();

        library.addBook(new Book("12345678","Introduction to Java","Elakkiya C"));
        library.addBook(new Book("12345","B","Elakkiya C"));
//        try{
//            library.addBook(new Book("12345","B","Elakkiya C"));
//
//        }catch(BookAlreadyFoundException e)
//        {
//            System.out.println(e.getMessage());
//        }
        library.addBook(new Book("123","Introduction to OOPS","Elakkiya C"));

        try{
            library.removeBook("1234");
        }catch(BookNotFoundException e){
            System.out.println(e.getMessage());
        }

        library.displayBooks();

        library.findBookIsbn("123");
        library.findBookTitle("B");
        // Book b1 = new Book("12345678","Introduction to Java","Elakkiya C");
        // System.out.println(b1);
    }
}