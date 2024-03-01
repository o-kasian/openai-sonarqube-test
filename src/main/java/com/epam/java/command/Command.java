package com.epam.java.command;

public interface Command {

    class CommandStartException extends Exception {}
    class CommandStopException extends Exception {}

    void start(String[] args) throws CommandStartException;

    void stop() throws CommandStopException;
}