package sample;

import javafx.application.Application;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;

import java.io.File;

import static javafx.stage.FileChooser.*;

public class Controller {

    public TextField pathToReplacements;
    public TextField pathToFDX;
    public TextField pathToYFact;
    public TextField oldName;
    public TextField newName;
    public VBox rootNode;


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

    public void changeProgramNames() {
    }

    public void changeBdNames() {
    }

    public void choosePathToYFact() {
        chooseDir(pathToYFact);
    }

    private void chooseDir(TextField field) {
        DirectoryChooser chooser = new DirectoryChooser();
        chooser.setTitle("JavaFX Projects");
        File defaultDirectory = new File("c:/");
        chooser.setInitialDirectory(defaultDirectory);
        File selectedDirectory = chooser.showDialog(rootNode.getScene().getWindow());
        field.setText(selectedDirectory.getPath());
    }
}
