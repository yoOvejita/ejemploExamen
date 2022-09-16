module com.pepe {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    opens com.pepe.ejemploExamen to javafx.fxml;
    exports com.pepe.ejemploExamen;
}