java
package com.epam.java.command;

public interface Command {

    void start(String[] args) throws CustomStartException;

    void stop() throws CustomStopException;
}