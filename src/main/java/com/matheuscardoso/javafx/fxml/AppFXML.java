package com.matheuscardoso.javafx.fxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.net.URL;

public class AppFXML extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        String pathToCSS = getClass().getResource("/fxml/Login.css").toExternalForm();
        URL fileFXML = getClass().getResource("/fxml/Login.fxml");
        GridPane gridPane = FXMLLoader.load(fileFXML);
        Scene scene = new Scene(gridPane, 350, 350);
        scene.getStylesheets().add(pathToCSS);

        stage.setResizable(false);
        stage.setTitle("Login Screen");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
