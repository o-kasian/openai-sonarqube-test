
package com.epam.java.command;

public interface Command {

    void start(String[] args) throws CustomCommandException;

    void stop() throws CustomCommandException;
}

class CustomCommandException extends Exception {
    public CustomCommandException(String message) {
        super(message);
    }
}
```
Note: It is always better to create a custom exception with a meaningful message instead of using a generic exception. This helps in improving the readability and maintainability of the code.