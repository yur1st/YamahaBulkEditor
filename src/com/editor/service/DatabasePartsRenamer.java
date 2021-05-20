package com.editor.service;

import com.editor.domain.database.PartsDatabaseFile;
import com.editor.domain.program.PcbDataFile;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class DatabasePartsRenamer implements RenamerInterface<PartsDatabaseFile> {

    private Map<String, String> substitutions;
    private String filename;

    public DatabasePartsRenamer(Map<String, String> substitutions, String filename) {
        this.substitutions = substitutions;
        this.filename = filename;

    }

    public PartsDatabaseFile unmarshall(String filename) throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(PartsDatabaseFile.class);
        return (PartsDatabaseFile) context.createUnmarshaller()
                .unmarshal(new FileReader(filename));
    }

    public void changeNames() throws JAXBException, IOException {
        PartsDatabaseFile databaseFile = unmarshall(filename);
        for (PartsDatabaseFile.Part part : databaseFile.getPart()) {
            part.getPart001().setPartsName(substitutions.get(part.getPart001().getPartsName()));
        }
        marshall(databaseFile, filename);
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
        mar.marshal(databaseFile, output);
    }


}
