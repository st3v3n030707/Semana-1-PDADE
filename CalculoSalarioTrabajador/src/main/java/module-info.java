module uam.edu.ni.calculosalariotrabajador {
    requires javafx.controls;
    requires javafx.fxml;


    opens uam.edu.ni.calculosalariotrabajador to javafx.fxml;
    exports uam.edu.ni.calculosalariotrabajador;
}