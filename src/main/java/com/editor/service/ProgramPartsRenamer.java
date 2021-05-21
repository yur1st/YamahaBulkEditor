package com.editor.service;

import com.editor.domain.program.PcbDataFile;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.editor.dao.MessageHelper.showError;

public class ProgramPartsRenamer extends AbstractPartsRenamer<PcbDataFile>
        implements RenamerInterface<PcbDataFile> {

    private String pathToYFact;

    public ProgramPartsRenamer(Map<String, String> substitutions, String pathToYFact) {
        super(substitutions);
        this.pathToYFact = pathToYFact;
    }

    public void changeNames() throws IOException, JAXBException {
        List<Path> ygxFiles = new ArrayList<>();
        try (Stream<Path> stream = Files.walk(Paths.get(pathToYFact))) {
            ygxFiles = stream
                    .filter(p -> p.toString().endsWith(".ygx"))
                    .collect(Collectors.toList());
        } catch (NoSuchFileException e) {
            showError("Указанной папки не существует");
        }

        if (ygxFiles.size() > 0) {

            for (Path path : ygxFiles) {
                substitute(path.toString());
            }
        } else {
            System.out.println("Список программ для замены пуст");
        }
    }

    public void substitute(String filename) throws JAXBException, IOException {
        PcbDataFile program = unmarshall(filename, PcbDataFile.class);
        if (program != null) {
            for (PcbDataFile.Machine.Parts.Part part : program.getMachine().getParts().getPart()) {
                String newName = prepareNewName(part.getPart001().getPartsName());
                part.getPart001().setPartsName(newName);
            }
            marshall(program, filename);
        }
    }

    public void marshall(PcbDataFile program, String filename) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(PcbDataFile.class);
        Marshaller mar = context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        File output = new File(filename);
        mar.marshal(program, output);
    }


}
