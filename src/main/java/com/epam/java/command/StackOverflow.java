package com.epam.java.command;

public class StackOverflow implements Command {

    @Override
    public void start(String[] args) throws Exception {
        recursiveCall(0);
    }

    @Override
    public void stop() throws Exception {
        // The 'stop' method has nothing to do by design. 
    }

    private void recursiveCall(int depth) {
        if (depth > 1000) return; // breaking condition
        recursiveCall(depth + 1);
    }
}