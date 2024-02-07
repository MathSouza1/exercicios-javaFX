package com.matheuscardoso.javafx.layout;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AppLayout extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent parent = null;
        VBox temp = new VBox();
        temp.getChildren().add(new Square());
        temp.getChildren().add(new Square());
        temp.getChildren().add(new Square());
        temp.getChildren().add(new Square());
        temp.getChildren().add(new Square());
        temp.getChildren().add(new Square());
        temp.getChildren().add(new Square());

        Scene scene = new Scene(temp, 800, 600);
        stage.setScene(scene);
        stage.setTitle("Layout managers");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
