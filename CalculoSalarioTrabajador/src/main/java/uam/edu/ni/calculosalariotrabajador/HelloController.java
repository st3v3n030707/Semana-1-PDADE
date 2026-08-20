package uam.edu.ni.calculosalariotrabajador;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    // La anotación @FXML es el "puente mágico". Le dice a Java:
    // "Busca en el archivo .fxml un elemento que tenga este mismo nombre (fx:id) y conéctalo aquí".
    @FXML
    private TextField txtSalario;
    @FXML
    private Label lblSeguro;
    @FXML
    private Label lblBono;
    @FXML
    private Label lblTotal;

    // Este es el método que se ejecuta al presionar el botón (por el onAction que pusimos en el FXML)
    @FXML
    protected void calcularSalario() {
        // try-catch se usa para atrapar errores. Por ejemplo, si el usuario escribe "hola"
        // en lugar de un número, el programa no se cierra (crashea), sino que muestra un mensaje de error.
        try {
            // getText() saca el texto de la caja, y Double.parseDouble lo convierte de letras a números decimales.
            double salario = Double.parseDouble(txtSalario.getText());

            // Calculamos el 7% fijo
            double seguroSocial = salario * 0.07;
            double porcentajeBono;

            // Evaluamos las condiciones del enunciado para ver qué porcentaje de bono le toca
            if (salario < 12000) {
                porcentajeBono = 0.10; // 10%
            } else if (salario <= 20000) {
                porcentajeBono = 0.05; // 5%
            } else {
                porcentajeBono = 0.03; // 3%
            }

            // Realizamos la matemática final
            double bono = salario * porcentajeBono;
            double total = salario - seguroSocial + bono;

            // String.format nos ayuda a poner el número con solo 2 decimales ("%.2f").
            // setText() cambia el texto que aparece en la pantalla por los resultados nuevos.
            lblSeguro.setText(String.format("Seguro Social (7%%): -C$ %.2f", seguroSocial));
            lblBono.setText(String.format("Bono (%.0f%%): +C$ %.2f", porcentajeBono * 100, bono));
            lblTotal.setText(String.format("Total a pagar: C$ %.2f", total));

        } catch (NumberFormatException ex) {
            // Si hubo un error (escribió texto en vez de números), mostramos esto en el gran total.
            lblTotal.setText("Error: Ingrese un salario numérico");
        }
    }
}