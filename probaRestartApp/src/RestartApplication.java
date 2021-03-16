import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;

public class RestartApplication {

    public static void restartApplication()
    {
        System.out.println("intra");
        final String javaBin = System.getProperty("java.home") + File.separator + "bin" + File.separator + "java";



        File currentJar = null;
        try {
            currentJar = new File(Main.class.getProtectionDomain().getCodeSource().getLocation().toURI());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        /* is it a jar file? */
        if(!currentJar.getName().endsWith(".jar"));
            return;
        System.out.println("continua");


        /* Build command: java -jar application.jar */
        final ArrayList<String> command = new ArrayList<String>();
        command.add(javaBin);
        command.add("-jar");
        command.add(currentJar.getPath());

        final ProcessBuilder builder = new ProcessBuilder(command);
        try {
            builder.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.exit(0);
        System.out.println("iese");
    }


}
