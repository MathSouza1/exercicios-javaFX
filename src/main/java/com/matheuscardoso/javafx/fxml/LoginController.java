package com.matheuscardoso.javafx.fxml;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.controlsfx.control.Notifications;

public class LoginController {
    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    public void enter() {
        boolean validEmail = emailField.getText().equals("aluno@cod3r.com.br");
        boolean validPassword = passwordField.getText().equals("12345678");

        if(validEmail && validPassword) {
            Notifications.create()
                    .position(Pos.TOP_RIGHT)
                    .title("Login FXML")
                    .text("Login successfully!")
                    .showInformation();
        } else {
            Notifications.create()
                    .position(Pos.TOP_RIGHT)
                    .title("Login FXML")
                    .text("User e Password invalids!")
                    .showError();
        }
    }
}
