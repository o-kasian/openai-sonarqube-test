
package com.nik.java.command;

public class StackOverflow implements Command {

    @Override
    public void start(String[] args) throws Exception {
        recursiveCall();
    }

    @Override
    public void stop() throws Exception {
        // Add implementation to stop the execution if needed
    }

    private void recursiveCall() {
        throw new UnsupportedOperationException("Recursive Call Not Implemented");
    }
}
