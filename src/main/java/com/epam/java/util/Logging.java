package com.epam.java.util;

public class Logging {

    private static final Logger INSTANCE = new Logger();
    private static final String PREFIX = " >> ";

    private Logging() {
        // Private constructor to prevent instantiation
    }

    public static Logger getLogger() {
        return INSTANCE;
    }

    public static class Logger {

        private java.util.logging.Logger javaLogger = java.util.logging.Logger.getLogger(Logging.class.getName());

        public void info(String message) {
            javaLogger.info(String.format("%s%s", PREFIX, message));
        }

        public void error(Throwable e) {
            javaLogger.severe(e.getMessage());
        }
    }

}