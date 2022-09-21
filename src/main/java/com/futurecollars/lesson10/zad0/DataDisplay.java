package com.futurecollars.lesson10.zad0;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DataDisplay {
    public void dataDisplay(String filePath) {

        try {
            Path path = Paths.get(filePath);
            String content = Files.readString(path);
            System.out.println(content);
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
}