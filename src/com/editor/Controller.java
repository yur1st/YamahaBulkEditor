package com.editor;

import com.editor.dao.CSVReader;
import com.editor.service.DatabasePartsRenamer;
import com.editor.service.ProgramPartsRenamer;
import jakarta.xml.bind.JAXBException;
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

import static javafx.stage.FileChooser.*;

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


    public void chooseReplacementsFile() {
        chooseFile(pathToReplacements, new ExtensionFilter("FDX Library", "*.csv", "*.txt"));
    }

    public void chooseFDXFile() {
        chooseFile(pathToFDX, new ExtensionFilter("FDX Library", "*.fdx"));
    }

    private void chooseFile(TextField field, ExtensionFilter filter) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().addAll(filter);
        File selectFile = fileChooser.showOpenDialog(rootNode.getScene().getWindow());
        field.setText(selectFile.getPath());
    }

    public void changeProgramNames() throws IOException, JAXBException {
        Map<String, String> subs = new HashMap<>();
        if (tabPane.getSelectionModel().getSelectedIndex() == 1) {
            subs = CSVReader.readCSV(pathToReplacements.toString());
        } else {
            subs.put(oldName.toString(), newName.toString());
        }
        ProgramPartsRenamer renamer = new ProgramPartsRenamer(subs, pathToYFact.toString());
        renamer.changeNames();
    }

    public void changeBdNames() throws IOException, JAXBException {
        Map<String, String> subs = new HashMap<>();
        if (tabPane.getSelectionModel().getSelectedIndex() == 1) {
            subs = CSVReader.readCSV(pathToReplacements.toString());
        } else {
            subs.put(oldName.toString(), newName.toString());
        }
        DatabasePartsRenamer renamer = new DatabasePartsRenamer(subs, pathToFDX.toString());
        renamer.changeNames();
    }

    public void choosePathToYFact() {
        chooseDir(pathToYFact);
    }

    private void chooseDir(TextField field) {
        DirectoryChooser chooser = new DirectoryChooser();
        chooser.setTitle("JavaFX Projects");
        File selectedDirectory = chooser.showDialog(rootNode.getScene().getWindow());
        field.setText(selectedDirectory.getPath());
    }
}
