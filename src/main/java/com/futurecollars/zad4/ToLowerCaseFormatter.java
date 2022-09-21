package com.futurecollars.zad4;

public class ToLowerCaseFormatter implements TextFormatter {

    @Override
    public String formatText(String text){
        return text.toLowerCase();
    }
}