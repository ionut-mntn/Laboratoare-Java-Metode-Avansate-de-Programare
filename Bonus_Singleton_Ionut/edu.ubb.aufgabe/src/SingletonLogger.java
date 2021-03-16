
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SingletonLogger {

    private static SingletonLogger uniqueInstance;

    private final String logFile = "unser_mensa2.txt";
    private PrintWriter writer;

    private SingletonLogger(){

        try{
            FileWriter fw = new FileWriter(logFile);
            writer = new PrintWriter(fw, true); // ce e autoflush asta? elibereaza buffer-ul?
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }

    public static SingletonLogger getInstance(){

        return uniqueInstance != null ? uniqueInstance : new SingletonLogger();
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

/*

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


 */