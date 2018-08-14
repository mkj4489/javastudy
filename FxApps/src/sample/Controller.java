package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Label label1;
    @FXML
    private TextField text1;

    @FXML
    protected void buttonAction(ActionEvent event) {
        String string1 = text1.getText();
        label1.setText("こんにちは、" + string1 + "!");

    }
}

