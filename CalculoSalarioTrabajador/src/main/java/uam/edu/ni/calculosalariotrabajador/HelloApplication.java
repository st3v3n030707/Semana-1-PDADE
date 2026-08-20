package uam.edu.ni.calculosalariotrabajador;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

// Al usar "extends Application", le decimos a Java que esta es una aplicación gráfica de JavaFX.
public class HelloApplication extends Application {

    // El método start es lo primero que se ejecuta al abrir el programa
    @Override
    public void start(Stage stage) throws IOException {

        // FXMLLoader agarra nuestro archivo de diseño (hello-view.fxml) y lo lee para construir la interfaz
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        // Scene es la "escena" (el contenido interior de la ventana). Le damos un tamaño inicial de 320x300 píxeles.
        Scene scene = new Scene(fxmlLoader.load(), 320, 300);

        // Stage es el "marco" de la ventana de Windows/Mac. Aquí le ponemos el título superior.
        stage.setTitle("Calculadora de Salario");

        // Metemos la escena dentro del marco
        stage.setScene(scene);

        // Hacemos que la ventana sea visible en la pantalla
        stage.show();
    }

    // El método main es el punto de entrada estándar de cualquier programa Java.
    // Llama a launch() para arrancar la interfaz.
    public static void main(String[] args) {
        launch();
    }
}