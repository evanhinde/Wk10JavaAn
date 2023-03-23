module com.example.wk10javaan {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.wk10javaan to javafx.fxml;
    exports com.example.wk10javaan;
}