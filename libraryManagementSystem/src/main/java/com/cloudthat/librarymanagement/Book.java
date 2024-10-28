package com.cloudthat.librarymanagement;

public class Book {

    //access modifiers : public,protected,default,private.
    //private : only access through the class

    private String isbn;
    private String title;
    private String author;

    @Override
    public String toString() {
        return "Book{" +
                "isbn=\"" + isbn + '\"' +
                ", title=\"" + title + '\"' +
                ", author=\"" + author + '\"' +
                '}';
    }

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }
}
