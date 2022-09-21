package com.futurecollars.lesson6.zad6;

public class DaysOfWeek {
    public static String convertNumberToDayOFWeek(int number) {
        String dayOfWeek;
        switch (number) {
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
            case 7:
                dayOfWeek = "Weekend";
                break;
            default:
                dayOfWeek = "There is no such a day";
                break;
        }
        return dayOfWeek;

    }

}
