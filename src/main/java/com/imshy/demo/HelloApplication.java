package com.imshy.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    private static TabPane tabPane = new TabPane();


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(FXMLExampleController.class.getResource("fxml_example.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        Tab tab1 = new Tab();
        tab1.setText("Welcome Screen");
        tab1.setContent(load("fxml_example.fxml"));
        tabPane.getTabs().add(tab1);
        VBox vBox = new VBox(tabPane);
        scene = new Scene(vBox, 960, 600);
        stage.setScene(scene);
        stage.setTitle("JavaFX App");
        stage.show();
    }

    public static void accessAllowed() {
        tabPane.getTabs().remove(0);
        Tab tab2 = new Tab("Hello tab");
        tab2.setContent(load("hello-view.fxml"));
        Tab tab3 = new Tab("Boats", new Label("Show all boats available"));
        tabPane.getTabs().add(tab2);
        tabPane.getTabs().add(tab3);
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

    public static void main(String[] args) throws IOException {
        HelloApplication.launch("hello-view.fxml");

    }
}