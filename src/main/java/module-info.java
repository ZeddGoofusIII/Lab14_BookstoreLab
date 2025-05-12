module com.example.lab14 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.lab14 to javafx.fxml;
    exports com.example.lab14;
}