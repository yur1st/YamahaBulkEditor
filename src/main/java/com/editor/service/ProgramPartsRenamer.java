package com.editor.service;

import com.editor.domain.program.PcbDataFile;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
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
                textSubstitute(path.toString());
            }
        } else {
            System.out.println("Список программ для замены пуст");
        }
    }

    public void textSubstitute(String filename) throws IOException {
        List<String> strings = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(new File(filename)))) {
            String line;
            while ((line = br.readLine()) != null) {
                strings.add(line);

            }
        }
        List<String> output = strings.stream()
                .map(s -> makeSubs(s))
                .collect(Collectors.toList());
        try (FileWriter writer = new FileWriter(filename)) {
            for (String str : output) {
                writer.write(str + System.lineSeparator());
            }
        }

    }

    private String makeSubs(String input) {
        String output = input;
        for (Map.Entry<String, String> entry : substitutions.entrySet()) {
            output = output.replace(entry.getKey(), entry.getValue());
        }
        return output;
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
