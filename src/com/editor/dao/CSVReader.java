package com.editor.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CSVReader {

    private CSVReader() {
    }

    public static Map<String, String> readCSV(String path) throws IOException {
        try (Stream<String> stream = Files.lines(Paths.get(path))) {
            return stream.map(s -> s.split(";", 2))
                    .collect(Collectors.toMap(a -> a[0], a -> a[1]));
        }

    }


}
