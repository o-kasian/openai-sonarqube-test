java
catch (InterruptedException e) {
    Thread.currentThread().interrupt();
    throw e;
}

monitor.wait(1000);

catch (InterruptedException e) {
    Thread.currentThread().interrupt();
    throw e;
}

monitor.wait(1000);

catch (InterruptedException e) {
    Thread.currentThread().interrupt();
    throw e;
}

monitor.wait(1000);