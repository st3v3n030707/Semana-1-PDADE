module uam.edu.ni.primerproyectojavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens uam.edu.ni.primerproyectojavafx to javafx.fxml;
    exports uam.edu.ni.primerproyectojavafx;
}