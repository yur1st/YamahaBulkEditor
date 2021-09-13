package com.editor.service;

import com.editor.domain.comparison.Specifications;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.FileReader;
import java.io.IOException;

public class ProgramPartsRenamerBySpec {


    private String pathToResults;
    private String pathToYFact;

    public ProgramPartsRenamerBySpec(String pathToResults, String pathToYFact) {
        this.pathToResults = pathToResults;
        this.pathToYFact = pathToYFact;
    }

    public void changeNames() throws IOException, JAXBException {
        Specifications specifications = unmarshall(pathToResults, Specifications.class);
        for (Specifications.Spec spec : specifications.getSpec()) {
            for (Specifications.Spec.Programs.Program program : spec.getPrograms().getProgram()) {

            }
        }
    }

    public <T> T unmarshall(String filename, Class<T> clazz) throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(clazz);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        try {
            T t = clazz.cast(unmarshaller.unmarshal(new FileReader(filename)));
            return t;
        } catch (Exception e) {
            System.out.println("File read error");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
        return null;
    }


}
