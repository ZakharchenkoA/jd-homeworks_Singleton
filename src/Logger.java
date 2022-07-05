import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    protected int num = 1;
    private static Logger logger;
    private final LocalDateTime time = LocalDateTime.now();
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    private Logger() {

    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void log(String msg) {
        System.out.println("[" + time.format(formatter) + " " + num++ + "] " + msg);
    }
}
