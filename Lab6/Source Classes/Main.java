package com.example.figmaapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        showProductList();
    }

    public void showProductList() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/ProductList.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        // Устанавливаем размер окна на весь экран
        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
        primaryStage.setX(screenBounds.getMinX());
        primaryStage.setY(screenBounds.getMinY());
        primaryStage.setWidth(screenBounds.getWidth());
        primaryStage.setHeight(screenBounds.getHeight());

        primaryStage.setScene(scene);
        primaryStage.setTitle("Каталог товаров");
        primaryStage.show();

        // Устанавливаем mainApp в контроллер
        ProductListController controller = loader.getController();
        controller.setMainApp(this);
    }

    public void showProductDetails() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/ProductDetails.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        // Устанавливаем размер окна на весь экран
        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
        primaryStage.setX(screenBounds.getMinX());
        primaryStage.setY(screenBounds.getMinY());
        primaryStage.setWidth(screenBounds.getWidth());
        primaryStage.setHeight(screenBounds.getHeight());

        primaryStage.setScene(scene);
        primaryStage.setTitle("Информация о товаре");
        primaryStage.show();

        // Устанавливаем mainApp в контроллер
        ProductDetailsController controller = loader.getController();
        controller.setMainApp(this);
    }

    public void showLogin() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Login.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        // Устанавливаем размер окна на весь экран
        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
        primaryStage.setX(screenBounds.getMinX());
        primaryStage.setY(screenBounds.getMinY());
        primaryStage.setWidth(screenBounds.getWidth());
        primaryStage.setHeight(screenBounds.getHeight());

        primaryStage.setScene(scene);
        primaryStage.setTitle("Вход в систему");
        primaryStage.show();

        // Устанавливаем mainApp в контроллер
        LoginController controller = loader.getController();
        controller.setMainApp(this);
    }

    public void showBooking() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Booking.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        // Устанавливаем размер окна на весь экран
        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
        primaryStage.setX(screenBounds.getMinX());
        primaryStage.setY(screenBounds.getMinY());
        primaryStage.setWidth(screenBounds.getWidth());
        primaryStage.setHeight(screenBounds.getHeight());

        primaryStage.setScene(scene);
        primaryStage.setTitle("Бронирование");
        primaryStage.show();

        // Устанавливаем mainApp в контроллер
        BookingController controller = loader.getController();
        controller.setMainApp(this);
    }

    public static void main(String[] args) {
        launch(args);
    }
}