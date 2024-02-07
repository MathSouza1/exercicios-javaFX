package com.matheuscardoso.javafx.layout;

import javafx.application.Platform;
import javafx.scene.layout.StackPane;

public class StackPaneTest extends StackPane {

    public StackPaneTest() {

        Box firstBox = new Box().withText("1");
        Box secondBox = new Box().withText("2");
        Box thirdBox = new Box().withText("3");
        Box fourthBox = new Box().withText("4");
        Box fifithBox = new Box().withText("5");
        Box sixthBox = new Box().withText("6");

        getChildren().addAll(secondBox, thirdBox, fourthBox, fifithBox, sixthBox, firstBox);

        setOnMouseClicked(action -> {
            if (action.getSceneX() > getScene().getWidth() / 2){
                getChildren().get(0).toFront();
            } else {
                 getChildren().get(5).toBack();
            }
        });
    }
}
