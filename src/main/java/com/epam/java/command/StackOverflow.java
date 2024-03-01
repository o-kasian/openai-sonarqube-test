package com.epam.java.command;

public class StackOverflow implements Command {

    @Override
    public void start(String[] args) throws Exception {
        recursiveCall(0);
    }

    @Override
    public void stop() throws Exception {
        // This method is intentionally left blank to adhere to the interface contract without needing an action at stop.
    }

    private void recursiveCall(int depth) {
        if (depth > 10) {
            return; // Adding a simple way to break out to prevent stack overflow.
        }
        recursiveCall(depth + 1);
    }
}