package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {



    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = null;
        root = FXMLLoader.load(getClass().getResource("Module.fxml"));
        primaryStage.setScene(new Scene(root));

        primaryStage.getScene().getStylesheets().add("sample/Style.css");


        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
