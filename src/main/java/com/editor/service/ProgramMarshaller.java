package com.editor.service;

import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.helpers.AbstractMarshallerImpl;

import javax.xml.transform.Result;

public class ProgramMarshaller extends AbstractMarshallerImpl implements Marshaller {

    @Override
    public void marshal(Object jaxbElement, Result result) throws JAXBException {

    }
}
