package com.editor.service;

import jakarta.xml.bind.JAXBException;

import java.io.IOException;

public interface RenamerInterface<T> {
    void changeNames() throws IOException, JAXBException;

    void marshall(T file, String filename) throws JAXBException, IOException;
}
