import java.util.logging.Level;
import java.util.logging.Logger;

public class LogExample {
    private static final Logger logger = Logger.getLogger(LogExample.class.getName());
    public static void main(String[] args) {
        logger.log(Level.INFO, "My first log message");
    }
}
