module uam.edu.ni.ejemplo_g1_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens uam.edu.ni.ejemplo_g1_1 to javafx.fxml;
    exports uam.edu.ni.ejemplo_g1_1;
}