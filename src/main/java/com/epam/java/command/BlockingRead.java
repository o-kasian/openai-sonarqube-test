java
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

private static final Logger LOGGER = LogManager.getLogger(BlockingRead.class);

LOGGER.info("Waiting for connection on port " + port);
LOGGER.info(String.format("Connected, will echo all requests on port %d", sock.getPort());
LOGGER.info("Disconnected");