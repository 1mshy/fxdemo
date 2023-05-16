package com.imshy.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class FXMLExampleController {
    @FXML
    public Text actiontarget;
    public PasswordField passwordField;
    public TextField userTextField;


    @FXML
    protected void handleSubmitButtonAction() {
        System.out.println(userTextField.getText());
        System.out.println(passwordField.getText());
        actiontarget.setText("Sign in button pressed");
        HelloApplication.accessAllowed();
    }
}
