package com.cloudthat.librarymanagement;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Library Management System");
        Library library = new Library();
        library.addBook(new Book("12345678","Introduction to Java","Elakkiya C"));
        library.addBook(new Book("12345","B","Elakkiya C"));
        library.addBook(new Book("123","Introduction to OOPS","Elakkiya C"));

        //library.removeBook("12345");
        library.displayBooks();

        library.findBookIsbn("123");
        library.findBookTitle("B");
        // Book b1 = new Book("12345678","Introduction to Java","Elakkiya C");
        // System.out.println(b1);
    }
}