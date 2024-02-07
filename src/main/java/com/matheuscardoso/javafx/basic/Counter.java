package com.matheuscardoso.javafx.basic;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Counter extends Application {

    private int counter = 0;

    @Override
    public void start(Stage stage) throws Exception {
        Label lblTitle = new Label("Counter");
        lblTitle.getStyleClass().add("title");

        Label lblNumber = new Label("0");
        lblNumber.getStyleClass().add("number");

        Button decrementButton = new Button("-");
        decrementButton.setOnAction(action -> {
            counter--;
            lblNumber.setText(Integer.toString(counter));
        });

        Button incrementButton = new Button("+");
        incrementButton.setOnAction(action -> {
            counter++;
            lblNumber.setText(Integer.toString(counter));
        });

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

        String cssPath = getClass().getResource("/basic/Counter.css").toExternalForm();

        Scene scene = new Scene(vBox, 400, 400);
        scene.getStylesheets().add(cssPath);
        scene.getStylesheets().add("https://fonts.googleapis.com/css?family=Oswald");

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
