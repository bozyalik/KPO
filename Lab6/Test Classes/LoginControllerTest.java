package com.example.figmaapp;

import javafx.event.ActionEvent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.testfx.framework.junit5.ApplicationTest;

import static org.mockito.Mockito.*;

public class LoginControllerTest extends ApplicationTest {

    private LoginController controller;
    private Main mainApp;

    @BeforeEach
    public void setUp() {
        controller = new LoginController();
        mainApp = Mockito.mock(Main.class);
        controller.setMainApp(mainApp);
    }

    @Test
    public void testHandleLoginAction() throws Exception {
        TextField emailField = new TextField("test@example.com");
        PasswordField passwordField = new PasswordField();
        passwordField.setText("password");

        controller.emailField = emailField;
        controller.passwordField = passwordField;

        controller.handleLoginAction(new ActionEvent());

        verify(mainApp, times(1)).showProductList();
    }
}