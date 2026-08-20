package uam.edu.ni.estadisticassalarios;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HelloController {

    // Variables conectadas al diseño visual (FXML)
    @FXML private TextField txtSalario;
    @FXML private Label lblConteo;
    @FXML private Label lblMax;
    @FXML private Label lblMin;
    @FXML private Label lblPromedio;
    @FXML private Label lblModa;

    // Lista temporal para ir guardando todos los salarios que ingreses
    private final List<Double> salarios = new ArrayList<>();

    // Función del botón "Agregar"
    @FXML
    protected void agregarSalario() {
        try {
            // Convierte el texto a número y lo guarda en la lista
            double salario = Double.parseDouble(txtSalario.getText());
            salarios.add(salario);

            // Actualiza el texto para decir cuántos van y limpia la caja de texto
            lblConteo.setText("Empleados registrados: " + salarios.size());
            txtSalario.clear();
        } catch (NumberFormatException e) {
            lblConteo.setText("Error: Escriba un número válido");
        }
    }

    // Función del botón "Calcular"
    @FXML
    protected void calcularEstadisticas() {
        // Si no hay salarios, no hacemos nada para evitar errores
        if (salarios.isEmpty()) return;

        // Variables de inicio
        double max = salarios.get(0);
        double min = salarios.get(0);
        double suma = 0;

        // Mapa para contar cuántas veces se repite cada salario (para sacar la moda)
        Map<Double, Integer> frecuencias = new HashMap<>();

        // Ciclo for que recorre todos los salarios de la lista
        for (double s : salarios) {
            if (s > max) max = s; // Si es mayor, es el nuevo máximo
            if (s < min) min = s; // Si es menor, es el nuevo mínimo
            suma += s;            // Lo sumamos al total

            // Contamos las repeticiones (si existe le suma 1, si no, empieza en 1)
            frecuencias.put(s, frecuencias.getOrDefault(s, 0) + 1);
        }

        double promedio = suma / salarios.size();

        // Buscar cuál salario se repitió más veces
        int maxRepeticiones = 0;
        for (int repeticion : frecuencias.values()) {
            if (repeticion > maxRepeticiones) {
                maxRepeticiones = repeticion;
            }
        }

        // Armar el texto de la moda
        String textoModa = "No hay salarios repetidos";
        if (maxRepeticiones > 1) { // Solo hay moda si un número aparece más de 1 vez
            List<Double> modas = new ArrayList<>();
            for (Map.Entry<Double, Integer> entry : frecuencias.entrySet()) {
                if (entry.getValue() == maxRepeticiones) modas.add(entry.getKey());
            }
            textoModa = modas.toString() + " (se repite " + maxRepeticiones + " veces)";
        }

        // Mostrar todo en pantalla
        lblMax.setText(String.format("Salario más alto: C$ %.2f", max));
        lblMin.setText(String.format("Salario más bajo: C$ %.2f", min));
        lblPromedio.setText(String.format("Promedio: C$ %.2f", promedio));
        lblModa.setText("Moda: " + textoModa);
    }

    // Función del botón "Reiniciar"
    @FXML
    protected void reiniciar() {
        salarios.clear(); // Borra todos los datos de la lista
        txtSalario.clear(); // Limpia la caja
        // Regresa las etiquetas a su estado original
        lblConteo.setText("Empleados registrados: 0");
        lblMax.setText("Salario más alto: C$ 0.00");
        lblMin.setText("Salario más bajo: C$ 0.00");
        lblPromedio.setText("Promedio: C$ 0.00");
        lblModa.setText("Moda: -");
    }
}