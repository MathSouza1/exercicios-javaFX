package com.matheuscardoso.javafx.basic;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Objects;

public class Counter extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Label lblTitle = new Label("Counter");
        Label lblNumber = new Label("0");

        Button decrementButton = new Button("-");
        Button incrementButton = new Button("+");

        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);
        hBox.setSpacing(10);
        hBox.getChildren().add(decrementButton);
        hBox.getChildren().add(incrementButton);

        VBox vBox = new VBox();
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(10);
        vBox.getChildren().add(lblTitle);
        vBox.getChildren().add(lblNumber);
        vBox.getChildren().add(hBox);

        Scene scene = new Scene(vBox, 400, 400);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
