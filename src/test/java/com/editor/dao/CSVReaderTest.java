package com.editor.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Map;

public class CSVReaderTest {

    @Test
    void readCSV() throws IOException {

        String filename = "C:\\Temp\\test\\bigTest.txt";
        Map<String, String> map = CSVReader.readCSV(filename);
        map.forEach((k, v) -> System.out.println(k + " --- " + v));
        Assertions.assertTrue(map.size() > 0);
    }
}