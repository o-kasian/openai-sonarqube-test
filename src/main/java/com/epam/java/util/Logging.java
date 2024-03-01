java
package com.epam.java.util;

public class Logging {

    private Logging() {}

    private static final Logger INSTANCE = new Logger();
    private static final String PREFIX = " >> ";
    private static final Logger LOGGER = Logger.getLogger();

    public static Logger getLogger() {
        return INSTANCE;
    }

    public static class Logger {

        public static Logger getLogger() {
            return LOGGER;
        }

        public void info(String message) {
            LOGGER.info(message);
        }

        public void error(Throwable e) {
            LOGGER.error(e);
        }
    }

}