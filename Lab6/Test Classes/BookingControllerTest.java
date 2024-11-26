package com.example.figmaapp;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.testfx.framework.junit5.ApplicationTest;

import static org.mockito.Mockito.*;

public class BookingControllerTest extends ApplicationTest {

    private BookingController controller;
    private Main mainApp;

    @BeforeEach
    public void setUp() {
        controller = new BookingController();
        mainApp = Mockito.mock(Main.class);
        controller.setMainApp(mainApp);
    }

    @Test
    public void testHandleBookAction() throws Exception {
        TextField fromField = new TextField("10:00");
        TextField toField = new TextField("12:00");
        TextField additionalInfoField = new TextField("Additional Info");

        controller.fromField = fromField;
        controller.toField = toField;
        controller.additionalInfoField = additionalInfoField;

        controller.handleBookAction(new ActionEvent());

        verify(mainApp, times(1)).showProductList();
    }
}