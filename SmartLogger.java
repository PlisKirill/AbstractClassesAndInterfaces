import java.time.LocalDateTime;

public class SmartLogger implements Logger {

    private int number = 0;

    @Override
    public void log(String msg) {
        this.number += 1;
        if (msg.toLowerCase().contains("error")) {
            System.out.println("ERROR#" + number + " [" + LocalDateTime.now() + "] " + msg);
        } else System.out.println("INFO#" + number + " [" + LocalDateTime.now() + "] " + msg);
    }
}
