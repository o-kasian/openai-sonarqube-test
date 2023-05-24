package com.epam.java.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Logging {

    private static final Logger instance = LoggerFactory.getLogger(Logging.class);
    private static final String PREFIX = " >> ";

    private Logging() {}

    public static Logger getLogger() {
        return instance;
    }

    public static class Logger {

        private final org.slf4j.Logger logger;

        public Logger() {
            logger = LoggerFactory.getLogger(Logger.class);
        }

        public void info(String message) {
            logger.info(PREFIX + message);
        }

        public void error(Throwable e) {
            logger.error("An error occurred", e);
        }
    }

}