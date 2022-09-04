package com.futurecollars.lesson7.zad4;

public class Converter {

    private long minutes;

    public static long convertMinutesToSeconds(long minutes) {
        long convertedMinutes = minutes * 60;
        return convertedMinutes;
    }

}