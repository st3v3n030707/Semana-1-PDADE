package uam.edu.ni.ejemplo_g1_1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Label tfName;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Hola" + tfName.getText());
    }
}
