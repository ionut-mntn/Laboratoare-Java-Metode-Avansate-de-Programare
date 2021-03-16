import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class UniLogger {

    private final String logFile = "unser_mensa.txt";
    private PrintWriter writer;

    public UniLogger() {
        try {
            FileWriter fw = new FileWriter(logFile);
            writer = new PrintWriter(fw, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void logEinzahlen(String student, double geld) {
        writer.println("EINZAHLEN (" + student + "): " + geld + "EUR");
    }

    public void logAbzahlen(String student, double geld) {
        writer.println("EINZAHLEN (" + student + "): " + geld + "EUR");

    }

    public void logUberTragen(String studentEins, String studentZwei, double geld) {
        writer.println("UBERTRAGEN (" + studentEins + "->" + studentZwei + "): " + geld + "EUR");
    }
}
