package com.futurecollars.lesson7.zad2;

public class Movie {
    private final String title;
    private final String nameAndSurname;
    private  final long durationTheMovie;
    private final int yearOfProduction;

    public Movie(String title, String nameAndSurname, long durationTheMovie, int yearOfProduction) {
        this.title = title;
        this.nameAndSurname = nameAndSurname;
        this.durationTheMovie = durationTheMovie;
        this.yearOfProduction = yearOfProduction;
    }
}
