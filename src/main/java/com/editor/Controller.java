package com.editor;

import com.editor.dao.CSVReader;
import com.editor.service.AbstractPartsRenamer;
import com.editor.service.DatabasePartsRenamer;
import com.editor.service.ProgramPartsRenamer;
import com.editor.service.ProgramPartsRenamerBySpec;
import jakarta.xml.bind.JAXBException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static com.editor.dao.MessageHelper.showError;
import static javafx.stage.FileChooser.ExtensionFilter;

public class Controller {

    @FXML
    public TextField pathToReplacements;
    @FXML
    public TextField pathToFDX;
    @FXML
    public TextField pathToYFact;
    @FXML
    public TextField oldName;
    @FXML
    public TextField newName;
    @FXML
    public VBox rootNode;
    @FXML
    public TabPane tabPane;
    @FXML
    public TextField pathToResults;


    public void chooseReplacementsFile() {
        chooseFile(pathToReplacements, new ExtensionFilter("TXT file", "*.csv", "*.txt"), "replacement");
    }

    public void chooseResultsFile() {
        chooseFile(pathToResults, new ExtensionFilter("XML file", "*.xml"), "results");
    }

    public void chooseFDXFile() {
        chooseFile(pathToFDX, new ExtensionFilter("FDX Library", "*.fdx"), "FDX");
    }

    private void chooseFile(TextField field, ExtensionFilter filter, String loc) {
        FileChooser fileChooser = new FileChooser();
        String initPath;
        if (pathToYFact.getText().isEmpty()) {
            initPath = "C:\\";
        } else {
            initPath = pathToYFact.getText();
        }
        fileChooser.setInitialDirectory(new File(initPath));
        fileChooser.getExtensionFilters().addAll(filter);
        File selectFile = fileChooser.showOpenDialog(rootNode.getScene().getWindow());
        if (selectFile != null) field.setText(selectFile.getPath());
    }

    public void changeProgramNames() throws IOException, JAXBException {
        renameAll("parts", pathToYFact.getText());
        showError("Обработка завершена");

        /*Map<String, String> subs = new HashMap<>();
        if (tabPane.getSelectionModel().getSelectedIndex() == 1) {
            subs = CSVReader.readCSV(pathToReplacements.getText());
        } else {
            subs.put(oldName.getText(), newName.getText());
        }
        ProgramPartsRenamer renamer = new ProgramPartsRenamer(subs, pathToYFact.getText());
        renamer.changeNames();*/
    }

    public void changeBdNames() throws IOException, JAXBException {
        renameAll("base", pathToFDX.getText());
        showError("Обработка завершена");

        /*Map<String, String> subs = new HashMap<>();
        boolean fieldsValid = false;
        if (tabPane.getSelectionModel().getSelectedIndex() == 1) {
            if (fieldsValid = validateFields(pathToReplacements, pathToFDX, pathToYFact))
                subs = CSVReader.readCSV(pathToReplacements.getText());
        } else {
            if (fieldsValid = validateFields(oldName, newName, pathToYFact))
                subs.put(oldName.getText(), newName.getText());
        }
        if (fieldsValid) {
            DatabasePartsRenamer renamer = new DatabasePartsRenamer(subs, pathToFDX.getText());
            renamer.changeNames();
        }*/
    }

    public void changeBySpec() throws IOException, JAXBException {
        renameAll("spec", pathToResults.getText());
        showError("Обработка завершена");

    }

    public <T extends AbstractPartsRenamer<T>> void renameAll(String what, String path) throws IOException, JAXBException {
        Map<String, String> subs = new HashMap<>();
        boolean fieldsValid = false;
        if (tabPane.getSelectionModel().getSelectedIndex() == 1) {
            if (fieldsValid = validateFields(pathToReplacements, pathToFDX, pathToYFact))
                subs = CSVReader.readCSV(pathToReplacements.getText());
        } else if (tabPane.getSelectionModel().getSelectedIndex() == 0) {
            if (fieldsValid = validateFields(oldName, newName, pathToYFact))
                subs.put(oldName.getText(), newName.getText());
        } else if (tabPane.getSelectionModel().getSelectedIndex() == 2) {
            if (fieldsValid = validateFields(pathToResults, pathToYFact))
                subs.put(oldName.getText(), newName.getText());
        }
        if (subs != null && fieldsValid) {
            if ("base".equals(what)) {
                DatabasePartsRenamer renamer = new DatabasePartsRenamer(subs, pathToFDX.getText());
                renamer.changeNames();
            } else if ("parts".equals(what)) {
                ProgramPartsRenamer renamer = new ProgramPartsRenamer(subs, pathToYFact.getText());
                renamer.changeNames();
            } else if ("spec".equals(what)) {
                ProgramPartsRenamerBySpec renamer = new ProgramPartsRenamerBySpec(pathToResults.getText(), pathToYFact.getText());
                renamer.changeNames();
            }
        } else {
            showError("Не заданы значения для переименовывания");
        }

    }

    private boolean validateFields(TextField... textFields) {
        for (TextField field : textFields) {
            if (field.getText().isEmpty()) {
                showError("Заполните все поля");
                return false;
            }
        }
        return true;
    }

    public void choosePathToYFact() {
        chooseDir(pathToYFact, "YFact");
    }

    private void chooseDir(TextField field, String location) {
        DirectoryChooser chooser = new DirectoryChooser();
        String initPath;
        if (pathToYFact.getText().isEmpty()) {
            initPath = "C:\\";
        } else {
            initPath = pathToYFact.getText();
        }
        chooser.setInitialDirectory(new File(initPath));
        chooser.setTitle("JavaFX Projects");
        File selectedDirectory = chooser.showDialog(rootNode.getScene().getWindow());
        if (selectedDirectory != null) field.setText(selectedDirectory.getPath());
    }

    public void quit(ActionEvent actionEvent) {

    }


}
