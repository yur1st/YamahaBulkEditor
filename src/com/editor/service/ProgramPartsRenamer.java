package com.editor.service;

import com.editor.dao.CSVReader;
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
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProgramPartsRenamer implements RenamerInterface<PcbDataFile> {

    private Map<String, String> substitutions;
    private String pathToYFact;

    public ProgramPartsRenamer(Map<String, String> substitutions, String pathToYFact) {
        this.substitutions = substitutions;
        this.pathToYFact = pathToYFact;
    }

    public void changeNames() throws IOException, JAXBException {
        List<Path> ygxFiles;
        try (Stream<Path> stream = Files.walk(Paths.get(pathToYFact))) {
            ygxFiles = stream
                    .filter(p -> p.toString().endsWith(".ygx"))
                    .collect(Collectors.toList());
        }

        for (Path path : ygxFiles) {
            substitute(path.toString());
        }
    }

    public PcbDataFile unmarshall(String filename) throws IOException, JAXBException {
        JAXBContext context = JAXBContext.newInstance(PcbDataFile.class);
        return (PcbDataFile) context.createUnmarshaller()
                .unmarshal(new FileReader(filename));
    }

    public void substitute(String filename) throws JAXBException, IOException {
        PcbDataFile program = unmarshall(filename);
        for (PcbDataFile.Machine.Parts.Part part : program.getMachine().getParts().getPart()) {
            part.getPart001().setPartsName(substitutions.get(part.getPart001().getPartsName()));
        }
        marshall(program, filename);
    }

    public void marshall(PcbDataFile program, String filename) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(PcbDataFile.class);
        Marshaller mar = context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        File output = new File(filename);
        mar.marshal(program, output);
    }


}
