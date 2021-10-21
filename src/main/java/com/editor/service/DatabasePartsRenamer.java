package com.editor.service;

import com.editor.domain.database.PartsDatabaseFile;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import static com.editor.dao.MessageHelper.showError;

public class DatabasePartsRenamer extends AbstractPartsRenamer<PartsDatabaseFile>
        implements RenamerInterface<PartsDatabaseFile> {

    private String filename;

    public DatabasePartsRenamer(Map<String, String> substitutions, String filename) {
        super(substitutions);
        this.filename = filename;

    }

    @Override
    public void changeNames() throws IOException, JAXBException {
        textSubstitute(filename);
    }

    public void substitute(String filename) throws JAXBException {
        PartsDatabaseFile databaseFile = unmarshall(filename, PartsDatabaseFile.class);
        if (databaseFile != null) {
            for (PartsDatabaseFile.Part part : databaseFile.getPart()) {
                String newName = prepareNewName(part.getPart001().getPartsName());
                part.getPart001().setPartsName(newName);
            }
            marshall(databaseFile, filename);
        } else {
            showError("Ошибка чтения файла БД");
        }
    }

    public void marshall(PartsDatabaseFile databaseFile, String filename) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(PartsDatabaseFile.class);
        Marshaller mar = context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        Path path = Paths.get(filename);
        Path baseDir = path.getParent();
        Path file = path.getFileName();
        Path out = Paths.get(baseDir.toString(), "new", file.toString());
        File output = new File(out.toString());
        output.getParentFile().mkdir();
        mar.marshal(databaseFile, output);
    }

}
