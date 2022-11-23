package com.futurecollars.zad3;

public class Employee {

    final int salary;
    final String name;
    final String surname;
    final int joinYear;
    int bonus;

    public Employee(String name, String surname, int workExp) {
        this.name = name;
        this.surname = surname;
        this.joinYear = workExp;
        this.salary = 3000;
    }

    public int workExp() {
        return 2022 - this.joinYear;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
