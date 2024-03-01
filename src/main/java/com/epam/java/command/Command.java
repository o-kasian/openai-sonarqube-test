package com.epam.java.command;

public interface Command {

    void start(String[] args) throws CommandExecutionException;

    void stop() throws CommandExecutionException;
}

class CommandExecutionException extends Exception {
    public CommandExecutionException(String message) {
        super(message);
    }

    public CommandExecutionException(String message, Throwable cause) {
        super(message, cause);
    }
}