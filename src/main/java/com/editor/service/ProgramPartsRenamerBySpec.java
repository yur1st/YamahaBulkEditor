package com.editor.service;

import com.editor.domain.comparison.Specifications;
import com.editor.domain.program.PcbDataFile;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import org.apache.commons.io.input.BOMInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

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
                Map<String, String> components = new HashMap<>();
                for (Specifications.Spec.Programs.Program.Parts.Part part : program.getParts().getPart()) {
                    components.put(part.getPos(), part.getName());
                }
                String path = pathToYFact + "\\" + program.getPath();
                PcbDataFile file = substituteByName(path, components);
                marshall(file, path);
            }
        }
    }

    private PcbDataFile substituteByName(String path, Map<String, String> components) throws JAXBException, IOException {
        PcbDataFile program = unmarshall(path, PcbDataFile.class);
        for (PcbDataFile.Machine.Mounts.Mount mount : program.getMachine().getMounts().getMount()) {
            String partNumber = mount.getComp();
            String refDes = mount.getComment();
            PcbDataFile.Machine.Parts.Part.Part001 part001 = program.getMachine().getParts().getPart().get(Integer.parseInt(partNumber.trim()) - 1).getPart001();
            String componentName = components.get(refDes);
            if (componentName != null) {
                part001.setPartsName(components.get(refDes));
            }
        }

        return program;
    }

    public <T> T unmarshall(String filename, Class<T> clazz) throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(clazz);
        Unmarshaller unmarshaller = context.createUnmarshaller();

        InputStream inputStream = new FileInputStream(filename);
        BOMInputStream bOMInputStream = new BOMInputStream(inputStream);
        try {
            T t = clazz.cast(unmarshaller.unmarshal(bOMInputStream));
            return t;
        } catch (Exception e) {
            System.out.println("File read error");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
        return null;
    }

    public void marshall(PcbDataFile program, String filename) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(PcbDataFile.class);
        Marshaller mar = context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        File output = new File(filename);
        mar.marshal(program, output);
    }

}
