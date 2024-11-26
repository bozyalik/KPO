package com.example.figmaapp;

import javafx.event.ActionEvent;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.testfx.framework.junit5.ApplicationTest;

import static org.mockito.Mockito.*;

public class ProductDetailsControllerTest extends ApplicationTest {

    private ProductDetailsController controller;
    private Main mainApp;

    @BeforeEach
    public void setUp() {
        controller = new ProductDetailsController();
        mainApp = Mockito.mock(Main.class);
        controller.setMainApp(mainApp);
    }

    @Test
    public void testHandleBookingAction() throws Exception {
        controller.handleBookingAction(new ActionEvent());

        verify(mainApp, times(1)).showBooking();
    }

    @Test
    public void testHandleBackToListAction() throws Exception {
        controller.handleBackToListAction(new ActionEvent());

        verify(mainApp, times(1)).showProductList();
    }
}