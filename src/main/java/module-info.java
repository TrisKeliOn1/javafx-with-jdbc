module com.project.javafxwithjdbc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.project.javafxwithjdbc to javafx.fxml;
    exports com.project.javafxwithjdbc;
    exports com.project.javafxwithjdbc.Controllers;
    opens com.project.javafxwithjdbc.Controllers to javafx.fxml;
}