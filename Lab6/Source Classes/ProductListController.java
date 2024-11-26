package com.example.figmaapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.io.IOException;

public class ProductListController {

    private Main mainApp;

    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }

    @FXML
    private Button menuButton;

    @FXML
    private Button profileButton;

    @FXML
    private void handleMenuButtonAction(ActionEvent event) {
        // Handle menu button action (e.g., open navigation drawer)
    }

    @FXML
    private void handleProfileButtonAction(ActionEvent event) {
        try {
            mainApp.showLogin();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleProductDetailsAction(ActionEvent event) {
        try {
            mainApp.showProductDetails();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}