module uam.edu.ni.estadisticassalarios {
    requires javafx.controls;
    requires javafx.fxml;


    opens uam.edu.ni.estadisticassalarios to javafx.fxml;
    exports uam.edu.ni.estadisticassalarios;
}