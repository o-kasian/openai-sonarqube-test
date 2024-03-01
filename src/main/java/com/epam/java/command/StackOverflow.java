package com.epam.java.command;

public class StackOverflow implements Command {

    @Override
    public void start(String[] args) throws Exception {
        boolean shouldStop = false;
        recursiveCall(shouldStop);
    }

    @Override
    public void stop() throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void recursiveCall(boolean shouldStop) {
        if (shouldStop) {
            return;
        }
        recursiveCall(shouldStop);
    }
}