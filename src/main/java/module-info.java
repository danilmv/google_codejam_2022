module com.example.google_codejam_2022 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.google_codejam_2022 to javafx.fxml;
    exports com.example.google_codejam_2022;
}