package uam.edu.ni.calculadora_basica;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        VBox root = new VBox();
        root.setSpacing(10);
        root.setPadding(new Insets(20));

        Label lblTitle = new Label("Calculadora Basica");
        Label lblNumber1 = new Label("Numero 1");
        TextField txtNumber1 = new TextField();
        Label lblNumber2 = new Label("Numero 2");
        TextField txtNumber2 = new TextField();
        Label lblAnswer = new Label("0");

        Button btnSum = new Button("+");
        Button btnSub = new Button("-");
        Button btnMulti = new Button("*");
        Button btnDiv = new Button("/");

        HBox buttons = new HBox();
        buttons.setSpacing(10);
        buttons.setPadding(new Insets(10));
        buttons.setStyle("-fx-background-color: #f0f0f0;");
        buttons.getChildren().addAll(btnSum, btnSub, btnMulti, btnDiv);

        root.getChildren().addAll(lblTitle, lblNumber1, txtNumber1, lblNumber2, txtNumber2, lblAnswer, buttons);

        Scene scene = new Scene(root, 200, 280);
        stage.setScene(scene);
        stage.setTitle("UAM");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}