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
        if(UserManager.getInstance().login(userTextField.getText(), passwordField.getText())) {
            System.out.println("Login successful");
            HelloApplication.accessAllowed();
        } else {
            actiontarget.setText("Login failed");
        }
    }

}
