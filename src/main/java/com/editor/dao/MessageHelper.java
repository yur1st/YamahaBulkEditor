package com.editor.dao;

import javafx.scene.control.Alert;

public abstract class MessageHelper {

    public static void showError(String text) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Предупреждение");
        alert.setHeaderText("Results:");
        alert.setContentText(text);
        alert.showAndWait();

    }
}
