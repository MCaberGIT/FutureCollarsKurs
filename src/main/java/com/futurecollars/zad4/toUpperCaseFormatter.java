package com.futurecollars.zad4;

public class toUpperCaseFormatter implements TextFormatter {

    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}