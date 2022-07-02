import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    protected int num = 1;
    private static Logger logger;

    private Logger() {

    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    LocalDateTime time = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    public void log(String msg) {
        System.out.println("[" + time.format(formatter) + " " + num++ + "] " + msg);
    }
}
