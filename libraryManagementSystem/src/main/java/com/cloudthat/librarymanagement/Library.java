package com.cloudthat.librarymanagement;

import com.cloudthat.librarymanagement.exceptions.BookAlreadyFoundException;
import com.cloudthat.librarymanagement.exceptions.BookNotFoundException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Library {
    private Map<String,Book> books;
    private static Set<String> bookIsbns;
    public Library(){
        books = new HashMap<>();
        bookIsbns = new HashSet<>();
    }

    //Add Books
    public void addBook(Book book){
        if(!bookIsbns.contains(book.getIsbn())){
            books.put(book.getIsbn(),book);
            bookIsbns.add(book.getIsbn());
            System.out.println("Book added successfully");
        }
        else {
            throw new BookAlreadyFoundException("Book with ISBN "+book.getIsbn()+" already exists");
//            System.out.println("Duplicate book found");
        }
    }

    //Removing a book
    public void removeBook(String isbn){
        if(books.containsKey(isbn)){
            Book removedBook = books.remove(isbn);
            System.out.println("Removed "+ removedBook);
        }else{
            throw new BookNotFoundException("Book with ISBN "+isbn+" does not exists");
//            System.out.println("Book does not exists");
        }
    }

    //Display all books
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No Books in the Library");
        } else {
            System.out.println("Books in the Library");
            books.forEach((isbn,book) -> System.out.println(book));
        }

    }

    //find books by isbn
    public void findBookIsbn(String Isbn) {
        Book book = books.get(Isbn);
        if(book!=null){
            System.out.println("Book with " + Isbn + " is present");
            System.out.println(book);
        } else {
            System.out.println("Required book with" + Isbn + " is not present");
        }
    }

    //find books by title
    public void findBookTitle(String Title){
       for(Map.Entry<String,Book>entry:books.entrySet()){
           if(entry.getValue().getTitle().equals(Title)){
               Book book = entry.getValue();
               System.out.println("Book with "+Title+" has been found");
               System.out.println(book);
               return;
           }
       }
        System.out.println("Book "+Title+" not found");
    }
}
