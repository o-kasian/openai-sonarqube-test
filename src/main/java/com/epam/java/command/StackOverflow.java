java
package com.epam.java.command;

public class StackOverflow implements Command {

    @Override
    public void start(String[] args) throws Exception {
        recursiveCall();
    }

    @Override
    public void stop() throws Exception {

    }

    /**
     * This method is recursively calling itself and does not have a way to break out of it.
     * As a result, it will cause a StackOverflowError.
     * To fix this, we need to add a way to break out of the recursion such as adding a condition or increasing the recursion limit.
     */
    private void recursiveCall() {
        if (someCondition) {
            return;
        }
        recursiveCall();
    }
}
