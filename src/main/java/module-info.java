module com.example.dbproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.example.dbproject to javafx.fxml;
    exports com.example.dbproject;
}