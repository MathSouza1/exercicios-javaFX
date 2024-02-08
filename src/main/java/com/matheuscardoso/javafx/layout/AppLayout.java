package com.matheuscardoso.javafx.layout;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class AppLayout extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent parent = null;
//      parent = new AnchorPaneTest();
//      parent = new BorderPaneTest();
//      parent = new FlowPaneTest();
//      parent = new StackPaneTest();
        parent = new TilePaneTest();
        Scene scene = new Scene(parent, 800, 600);
        stage.setScene(scene);
        stage.setTitle("Layout managers");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
