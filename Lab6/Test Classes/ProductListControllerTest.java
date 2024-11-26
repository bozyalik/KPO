package com.example.figmaapp;

import javafx.event.ActionEvent;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.testfx.framework.junit5.ApplicationTest;

import static org.mockito.Mockito.*;

public class ProductListControllerTest extends ApplicationTest {

    private ProductListController controller;
    private Main mainApp;

    @BeforeEach
    public void setUp() {
        controller = new ProductListController();
        mainApp = Mockito.mock(Main.class);
        controller.setMainApp(mainApp);
    }

    @Test
    public void testHandleProductDetailsAction() throws Exception {
        controller.handleProductDetailsAction(new ActionEvent());

        verify(mainApp, times(1)).showProductDetails();
    }
}