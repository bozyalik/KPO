package com.example.figmaapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    TextField emailField;

    @FXML
    PasswordField passwordField;

    @FXML
    private Button loginButton;

    private Main mainApp;

    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }

    @FXML
    void handleLoginAction(ActionEvent event) {
        // Handle login logic here.  For example:
        String email = emailField.getText();
        String password = passwordField.getText();

        // Validate input
        if (email.isEmpty() || password.isEmpty()) {
            // Show error message
            return;
        }

        // Perform authentication (e.g., against a database or API)

        // If successful, navigate to the next screen:
        try {
            mainApp.showProductList(); // Or whichever screen should come after login
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}