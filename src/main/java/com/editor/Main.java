package com.editor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("mainWindow.fxml"));
        primaryStage.setTitle("Утилита групповой модификации программ");
        primaryStage.setScene(new Scene(root, 630, 290));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
