package com.editor.dao;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.editor.dao.MessageHelper.showError;

public class CSVReader {

    private CSVReader() {
    }

    public static Map<String, String> readCSV(String path) {
        try (Stream<String> stream = Files.lines(Paths.get(path))) {
            return stream.map(s -> s.split(";", 2))
                    .collect(Collectors.toMap(a -> a[0], a -> a[1], (a1, a2) -> {
                        System.out.println("duplicate key found!");
                        return a1;
                    }));
        } catch (IOException e) {
            showError("Ошибка чтения файла");
        }
        return null;
    }


}
