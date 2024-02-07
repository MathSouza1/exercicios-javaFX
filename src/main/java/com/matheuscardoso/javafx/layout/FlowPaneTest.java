package com.matheuscardoso.javafx.layout;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;

public class FlowPaneTest extends FlowPane {

    public FlowPaneTest() {
        Square firstSquare = new Square();
        Square secondSquare = new Square();
        Square thirdSquare = new Square();
        Square fourthSquare = new Square();
        Square fifithSquare = new Square();

        setHgap(10);
        setVgap(10);
        setPadding(new Insets(10));
        setOrientation(Orientation.VERTICAL);
        setAlignment(Pos.CENTER_RIGHT);

        getChildren().addAll(firstSquare, secondSquare, thirdSquare, fourthSquare, fifithSquare);
    }
}
