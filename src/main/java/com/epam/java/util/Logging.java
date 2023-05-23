
package com.epam.java.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logging {

    private static final Logger instance = LoggerFactory.getLogger(Logging.class);
    private static final String PREFIX = " >> ";

    private Logging() {}

    public static Logger getLogger() {
        return instance;
    }

    public static class LoggerWrapper {

        private final Logger logger = LoggerFactory.getLogger(LoggerWrapper.class);

        public void info(String message) {
            logger.info(PREFIX + message);
        }

        public void error(Throwable e) {
            logger.error("Error occurred", e);
        }
    }
}
