package uam.edu.ni.estadisticassalarios;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Carga la interfaz visual que diseñamos en el archivo FXML
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        // Define el tamaño de la ventana (350 de ancho x 360 de alto)
        Scene scene = new Scene(fxmlLoader.load(), 350, 360);

        // Título de la ventana del programa
        stage.setTitle("Estadísticas - UAM");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}