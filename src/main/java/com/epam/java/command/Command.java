
package com.epam.java.command;

public interface Command {

    void start(String[] args) throws CustomException;

    void stop() throws CustomException;
}

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
