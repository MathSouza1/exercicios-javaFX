package com.matheuscardoso.javafx.layout;

import javafx.geometry.Pos;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public class AnchorPaneTest extends AnchorPane {
    
    public AnchorPaneTest() {
        Square firstSquare = new Square();
        setTopAnchor(firstSquare, 10.0);
        setLeftAnchor(firstSquare, 10.0);

        Square secondSquare = new Square();
        setTopAnchor(secondSquare, 10.0);
        setRightAnchor(secondSquare, 10.0);

        Square thirdSquare = new Square();
        setBottomAnchor(thirdSquare, 10.0);
        setLeftAnchor(thirdSquare, 10.0);

        Square fourthSquare = new Square();
        setBottomAnchor(fourthSquare, 10.0);
        setRightAnchor(fourthSquare, 10.0);

        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);
        setTopAnchor(hBox, 110.0);
        setBottomAnchor(hBox, 110.0);
        setLeftAnchor(hBox, 110.0);
        setRightAnchor(hBox, 110.0);

        Square q5 = new Square();
        hBox.getChildren().add(q5);

        getChildren().addAll(firstSquare, secondSquare, thirdSquare, fourthSquare, hBox);
    }
}
