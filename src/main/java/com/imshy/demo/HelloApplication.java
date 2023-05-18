package com.imshy.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    private static Stage stage;

    @Override
    public void start(Stage stage) {
        HelloApplication.stage = stage;
        Scene scene = new Scene((Parent) load("fxml_example.fxml"), 960, 600);
//        scene.getStylesheets().add(HelloApplication.class.getResource("demo.css").toExternalForm());
        stage.setTitle("Login Screen");
        stage.setScene(scene);
        stage.show();
    }

    public static void accessAllowed() {
        System.out.println("Access allowed");
        Tab tab2 = new Tab("Hello tab");
        tab2.setContent(load("hello-view.fxml"));
        Tab tab3 = new Tab("Boats");
        tab3.setContent(load("css_demo.fxml"));
        TabPane tabPane = new TabPane();
        tabPane.getTabs().add(tab2);
        tabPane.getTabs().add(tab3);
        VBox vBox = new VBox(tabPane);
        Scene scene = new Scene(vBox, 960, 600);
        scene.getStylesheets().add(HelloApplication.class.getResource("demo.css").toExternalForm());
        stage.setScene(scene);
        stage.setTitle("JavaFX App");
        stage.show();
    }

    public static void launch(String... args) {
        Application.launch(args);
    }

    public static Node load(String fxmlFile) {
        try {
            return (Node) FXMLLoader.load(Objects.requireNonNull(HelloApplication.class.getResource(fxmlFile)));
        } catch (IOException e) {
            System.out.println("Error loading " + fxmlFile);
            throw new RuntimeException("Cannot load file " + fxmlFile);
        }
    }

    public static void main(String[] args) {
        HelloApplication.launch();
    }
}