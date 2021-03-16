import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class ErsteAnwendung extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Label labelHelloW =  new Label("Hello World");
        labelHelloW.setFont(new Font(50));

        Scene scene = new Scene(labelHelloW);
        stage.setScene( scene);

        Scene sceneZwei = new Scene(labelHelloW);



        stage.show();
    }
}
