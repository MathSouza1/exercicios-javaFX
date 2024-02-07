package com.matheuscardoso.javafx.basic;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Wizard extends Application {

    private Stage window;
    private Scene firstStep;
    private Scene secondStep;
    private Scene thirdStep;

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        createFirstStep();
        createSecondStep();
        createThirdStep();
        window.setScene(firstStep);
        window.setTitle("Wizard :: step 1");
        window.show();
    }

    private void createFirstStep() {
        Button nextStep = new Button("Go to step 2 >>");
        nextStep.setOnAction(action -> {
            window.setScene(secondStep);
            window.setTitle("Wizard :: step 2");
        });

        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().add(nextStep);
        firstStep = new Scene(hBox, 400, 400);
    }

    private void createSecondStep() {
        Button previousStep = new Button("<< Go back to step 1");
        previousStep.setOnAction(e -> {
            window.setScene(firstStep);
            window.setTitle("Wizard :: step 1");
        });

        Button nextStep = new Button("Go to step 3 >>");
        nextStep.setOnAction(e -> {
            window.setScene(thirdStep);
            window.setTitle("Wizard :: step 3");
        });

        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().add(previousStep);
        hBox.getChildren().add(nextStep);
        secondStep = new Scene(hBox, 400, 400);
    }

    private void createThirdStep() {
        Button previousStep = new Button("<< Go back to step 2");
        previousStep.setOnAction(e -> {
            window.setScene(secondStep);
        });

        Button nextStep = new Button("Finish!");
        nextStep.setOnAction(e -> {
            System.exit(0);
        });

        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().add(previousStep);
        hBox.getChildren().add(nextStep);
        thirdStep = new Scene(hBox, 400, 400);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
