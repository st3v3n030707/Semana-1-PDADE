module uam.edu.ni.calculadora_basica {
    requires javafx.controls;
    requires javafx.fxml;


    opens uam.edu.ni.calculadora_basica to javafx.fxml;
    exports uam.edu.ni.calculadora_basica;
}