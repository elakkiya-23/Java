package com.cloudthat.librarymanagement.exceptions;

public class BookAlreadyFoundException extends RuntimeException {
    public BookAlreadyFoundException(String message) {
        super(message);
    }
}
