package examples.class_demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        var testColor = Paint.valueOf("Purple");
        var bigFont = Font.font(25);
        welcomeText.setFont(bigFont);
        welcomeText.setTextFill(testColor);
        welcomeText.setText("Welcome to JavaFX Application!");

    }
}