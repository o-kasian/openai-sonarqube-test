package com.epam.java.util;

public class Logging {

    private Logging() {}

    private static final Logger instance = new Logger();
    private static final String PREFIX = " >> ";

    public static Logger getLogger() {
        return instance;
    }

    public static class Logger {

        private java.util.logging.Logger jLogger = java.util.logging.Logger.getLogger(Logging.class.getName());

        public void info(String message) {
            jLogger.info(String.format("%s%s", PREFIX, message));
        }

        public void error(Throwable e) {
            jLogger.severe(e.getMessage());
        }
    }

}