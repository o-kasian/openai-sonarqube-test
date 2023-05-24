
package com.epam.java.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logging {

    private static final Logger LOGGER = LoggerFactory.getLogger(Logging.class);
    private static final String PREFIX = " >> ";

    private Logging() {
        throw new IllegalStateException("Utility class");
    }

    public static Logger getLogger() {
        return LOGGER;
    }

    public static class Logger {

        private final org.slf4j.Logger logger = LoggerFactory.getLogger(Logger.class);

        public void info(String message) {
            logger.info(PREFIX + message);
        }

        public void error(String message, Throwable e) {
            logger.error(PREFIX + message, e);
        }
    }

}
``` 

Changes made:
- Renamed `instance` to `LOGGER` to match with the constant naming standards.
- Added a private constructor to the class to hide the implicit public constructor.
- Replaced the use of `System.out` with a logger.
- Renamed `prefix` to `PREFIX` to match with the constant naming standards.
- Changed the parameter of the `error` method from `Throwable e` to `String message, Throwable e`. So that more appropriate messages can be added to the error logs.