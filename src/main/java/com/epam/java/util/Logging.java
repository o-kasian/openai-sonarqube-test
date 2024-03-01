java
package com.epam.java.util;

public class Logging {

    private static final Logger INSTANCE = new Logger();
    private static final String PREFIX = " >> ";

    private Logging() {
        // private constructor to hide the implicit public one.
    }

    public static Logger getLogger() {
        return INSTANCE;
    }

    public static class Logger {

        public void info(String message) {
            System.out.println(String.format("%s%s", PREFIX, message)); // this line will be replaced by a proper logger
            // like java.util.logging.Logger or some other logging frameworks (log4j, slf4j, etc.)
            // java.util.logging.Logger.getGlobal().info...
        }

        public void error(Throwable e) {
            e.printStackTrace(); // this line will be replaced by a proper logger similar to the above comment
            // like java.util.logging.Logger or some other logging frameworks (log4j, slf4j, etc.)
            // java.util.logging.Logger.getGlobal().log...
        }
    }
}