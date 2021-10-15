import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LogExample {
    private static final Logger LOGGER = Logger.getLogger(LogExample.class.getName());

    static {
        LOGGER.setLevel(Level.FINEST);
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.FINEST);
        LOGGER.addHandler(consoleHandler);
    }

    public static void main(String[] args) {
        LOGGER.log(Level.INFO, "My first log message");
    }
}
