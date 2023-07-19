package com.epam.java.command;

import com.epam.java.util.Logging;

public class DeadLock implements Command {

private static final Logging.Logger LOGGER = Logging.getLogger();

private final Object monitor1 = new Object();
private final Object monitor2 = new Object();

@Override
public void start(String[] args) throws Exception {
    LOGGER.info("Starting threads");
    synchronized (monitor1) {
        synchronized (monitor2) {
            LOGGER.info("Starting threads");
            Thread t1 = new Thread(() -> {
                LOGGER.info("Acquired monitor1 by thread 1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                LOGGER.info("Acquired monitor2 by thread 1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
            Thread t2 = new Thread(() -> {
                LOGGER.info("Acquired monitor2 by thread 2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                LOGGER.info("Acquired monitor1 by thread 2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
            t1.start();
            t2.start();
        }
    }
}

@Override
public void stop() throws Exception {

}

}