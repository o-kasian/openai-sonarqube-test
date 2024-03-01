package com.epam.java.command;

public class StackOverflow implements Command {

    @Override
    public void start(String[] args) throws Exception {
        recursiveCall(0);
    }

    @Override
    public void stop() throws Exception {
        // Method intentionally left empty as no action is required on stop
    }

    private void recursiveCall(int depth) {
        if (depth > 10) {
            return; // Add a simple way to break out to prevent stack overflow
        }
        recursiveCall(depth + 1);
    }
}