package com.epam.java.command;

public class StackOverflow implements Command {

    @Override
    public void start(String[] args) throws Exception {
        recursiveCall();
    }

    @Override
    public void stop() throws Exception {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    private void recursiveCall() {
        if (condition) {
            return;
        }
        recursiveCall();
    }
}