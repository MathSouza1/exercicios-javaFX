module org.example.exerciciosjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.matheuscardoso.javafx.basic to javafx.fxml;
    exports com.matheuscardoso.javafx.basic;

    opens com.matheuscardoso.javafx.layout to javafx.fxml;
    exports com.matheuscardoso.javafx.layout;
    opens com.matheuscardoso.javafx.fxml to javafx.fxml;
    exports com.matheuscardoso.javafx.fxml;
}