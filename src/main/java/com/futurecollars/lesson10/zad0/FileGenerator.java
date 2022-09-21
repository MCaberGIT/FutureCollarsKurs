package com.futurecollars.lesson10.zad0;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileGenerator {
    public static void main(String[] args) {
        try {
        File file = new File( "C:/Users/mcabe/IdeaProjects/FutureCollarsKurs/src/main/resources/data.txt");

        if(!file.exists()) {
            file.createNewFile();
        }

        PrintWriter pw = new PrintWriter(file);
        pw.println("Kurs\n" +
                "Java\n" +
                "Lekcja 6\n" +
                "Pliki\n" +
                "Wyjątki\n" +
                "Pliki\n" +
                "Koniec pliku");
        pw.close();
        System.out.println("Done");
        } catch (IOException e) {
                e.printStackTrace();
            }

    }
}
