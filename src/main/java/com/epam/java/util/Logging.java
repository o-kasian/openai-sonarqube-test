package com.epam.java.util;

public class Logging {

    private static final Logger INSTANCE = new Logger();
    private static final String PREFIX = " >> ";
    private Logging() {}

    public static Logger getLogger() {
        return INSTANCE;
    }

    public static class Logger {

        public void info(String message) {
            // assuming java.util.logging.Logger here
            java.util.logging.Logger.getLogger("").info(String.format("%s%s", PREFIX, message));
        }

        public void error(Throwable e) {
            // assuming java.util.logging.Logger here
            java.util.logging.Logger.getLogger("").severe(e.toString());
        }
    }

}