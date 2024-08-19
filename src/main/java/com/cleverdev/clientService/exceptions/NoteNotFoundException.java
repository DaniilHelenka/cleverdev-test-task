package com.cleverdev.clientService.exceptions;



public class NoteNotFoundException extends Exception{
    public NoteNotFoundException(String message) {
        super(message);
    }

    public NoteNotFoundException() {
    }
}
