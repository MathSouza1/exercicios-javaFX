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
        decrementButton.getStyleClass().add("buttons");
        decrementButton.setOnAction(action -> {
            counter--;
            updateLabelNumber(lblNumber);
        });

        Button incrementButton = new Button("+");
        incrementButton.getStyleClass().add("buttons");
        incrementButton.setOnAction(action -> {
            counter++;
            updateLabelNumber(lblNumber);
        });

        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);
        hBox.setSpacing(10);
        hBox.getChildren().add(decrementButton);
        hBox.getChildren().add(incrementButton);

        VBox vBox = new VBox();
        vBox.getStyleClass().add("content");
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

    private void updateLabelNumber(Label label) {
        label.setText(Integer.toString(counter));
        label.getStyleClass().remove("green");
        label.getStyleClass().remove("red");
        if (counter > 0) {
            label.getStyleClass().add("green");
        } else if (counter < 0) {
            label.getStyleClass().add("red");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
