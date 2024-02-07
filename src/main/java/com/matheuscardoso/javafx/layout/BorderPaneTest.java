package com.matheuscardoso.javafx.layout;

import javafx.scene.layout.BorderPane;

public class BorderPaneTest extends BorderPane {
    
    public BorderPaneTest() {
        Box firstBox = new Box().withText("Topo");
        setTop(firstBox);

        Box secondBox = new Box().withText("Esquerda");
        setLeft(secondBox);

        Box thirdBox = new Box().withText("Direita");
        setRight(thirdBox);

        Box fourthBox = new Box().withText("Fundo");
        setBottom(fourthBox);

        Box fifithBox = new Box().withText("Área Central");
        setCenter(fifithBox);
    }
}
