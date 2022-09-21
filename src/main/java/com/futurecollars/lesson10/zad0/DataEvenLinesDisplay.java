package com.futurecollars.lesson10.zad0;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class DataEvenLinesDisplay {
    public void displayDataEvenLines(String filePath) {
        List<String> content = new ArrayList<>();

        try {
            Path path = Paths.get(filePath);
            content = Files.readAllLines(path);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        for (int i = 0; i < content.size(); i = i + 2) {
            System.out.println(content.get(i));
        }

    }
}