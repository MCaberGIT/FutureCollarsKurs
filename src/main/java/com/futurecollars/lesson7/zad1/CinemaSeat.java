package com.futurecollars.lesson7.zad1;

public class CinemaSeat {

    private final int number;
    private final int rowNumber;
    private boolean isFree;

    public CinemaSeat(int number, int rowNumber, boolean isFree) {
        this.number = number;
        this.rowNumber = rowNumber;
        this.isFree = isFree;
    }
}
