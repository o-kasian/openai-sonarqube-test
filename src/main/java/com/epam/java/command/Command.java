package com.epam.java.command;

public interface Command {

    void start(String[] args) throws CommandException;

    void stop() throws CommandException;
}

class CommandException extends Exception {
    public CommandException(String message) {
        super(message);
    }

    public CommandException(String message, Throwable cause) {
        super(message, cause);
    }
}