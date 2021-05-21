package com.editor.service;

import jakarta.xml.bind.JAXBException;

import java.io.IOException;

public interface RenamerInterface<T> {
    void changeNames() throws IOException, JAXBException;

    T unmarshall(String filename, Class<T> clazz) throws JAXBException, IOException;

    String prepareNewName(String partsName);

    void marshall(T file, String filename) throws JAXBException, IOException;
}
