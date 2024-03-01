package com.epam.java.command;

public class CustomCommandException extends Exception {
    public CustomCommandException(String errorMessage) {
        super(errorMessage);
    }
}

public interface Command {

    void start(String[] args) throws CustomCommandException;

    void stop() throws CustomCommandException;
}