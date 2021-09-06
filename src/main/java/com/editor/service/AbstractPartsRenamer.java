package com.editor.service;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.FileReader;
import java.util.Map;

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
