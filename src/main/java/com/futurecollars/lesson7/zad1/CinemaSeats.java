package com.futurecollars.lesson7.zad1;

public class CinemaSeats {

    private final int number;
    private final int rowNumbers;
    private boolean isFree;

    public CinemaSeats(int number, int rowNumbers, boolean isFree) {
        this.number = number;
        this.rowNumbers = rowNumbers;
        this.isFree = isFree;
    }
}
