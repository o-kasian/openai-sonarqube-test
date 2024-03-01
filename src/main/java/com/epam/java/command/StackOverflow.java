package com.epam.java.command;

public class StackOverflow implements Command {

    @Override
    public void start(String[] args) throws Exception {
        recursiveCall(0);
    }

    @Override
    public void stop() throws Exception {
        // Method intentionally left blank
    }

    private void recursiveCall(int depth) {
        if (depth > 10) {
            return;
        }
        recursiveCall(depth + 1);
    }
}