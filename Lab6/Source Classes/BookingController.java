package com.example.figmaapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class BookingController {

    @FXML
    TextField fromField;

    @FXML
    TextField toField;

    @FXML
    TextField additionalInfoField;

    @FXML
    private Button bookButton;

    private Main mainApp;

    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }

    @FXML
    void handleBookAction(ActionEvent event) {
        // Get booking details
        String from = fromField.getText();
        String to = toField.getText();
        String additionalInfo = additionalInfoField.getText();

        // Validate input
        if (from.isEmpty() || to.isEmpty()) {
            // Show error message
            return;
        }

        // Process booking (e.g., send data to a server, update database)

        // Provide feedback to the user (e.g., confirmation message)

        // Navigate back to the product list or another appropriate screen
        try {
            mainApp.showProductList();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}