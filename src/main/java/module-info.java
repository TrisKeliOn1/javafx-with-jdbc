module com.project.javafxwithjdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.java;

    opens com.project.javafxwithjdbc to javafx.fxml;
    opens com.project.javafxwithjdbc.Controllers to javafx.fxml;
    opens com.project.javafxwithjdbc.model.entities to javafx.base;

    exports com.project.javafxwithjdbc;
    exports com.project.javafxwithjdbc.Controllers;
}