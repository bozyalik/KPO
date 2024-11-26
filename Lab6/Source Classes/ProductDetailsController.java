package com.example.figmaapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.io.IOException;

public class ProductDetailsController {

    private Main mainApp;

    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }

    @FXML
    private Button bookButton;

    @FXML
    private Button backToListButton;

    @FXML
    void handleBookingAction(ActionEvent event) {
        try {
            mainApp.showBooking();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleBackToListAction(ActionEvent event) {
        try {
            mainApp.showProductList();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}