package examples.class_demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SecondWindow {
    @FXML
    private Label helloLabel;

    @FXML
    protected void HelloClicked() {
        helloLabel.setText("We set this up ourselves this time.");
    }
}
