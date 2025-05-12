package com.example.lab14;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BookstoreController {
    @FXML
    private Label info;
    @FXML
    private TextField title, price, discount, quantity;

    public void order() {
        info.setText(OrderManager.placeOrder(title, price, quantity, discount));
    }
}