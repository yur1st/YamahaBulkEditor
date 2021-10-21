package com.editor.service;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AbstractPartsRenamer<T> {
    protected Map<String, String> substitutions;

    public AbstractPartsRenamer(Map<String, String> substitutions) {
        this.substitutions = substitutions;
    }

    public String prepareNewName(String partsName) {
        return substitutions.getOrDefault(partsName, partsName);
    }

    public T unmarshall(String filename, Class<T> clazz) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(clazz);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        try {
            return clazz.cast(unmarshaller.unmarshal(new FileReader(filename)));
        } catch (Exception e) {
            System.out.println("File read error");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
        return null;
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
                .map(this::makeSubs)
                .collect(Collectors.toList());
        try (FileWriter writer = new FileWriter(filename)) {
            for (String str : output) {
                writer.write(str + System.lineSeparator());
            }
        }

    }

    public String makeSubs(String input) {
        String output = input;
        for (Map.Entry<String, String> entry : substitutions.entrySet()) {
            output = output.replace(entry.getKey(), entry.getValue());
        }
        return output;
    }
}
