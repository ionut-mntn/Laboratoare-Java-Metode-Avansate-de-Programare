package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller  implements Initializable {

    @FXML
    private TextField username;
    @FXML
    private TextField password;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void showname(ActionEvent actionEvent) {
        System.out.println(username.getText());
    }
}
