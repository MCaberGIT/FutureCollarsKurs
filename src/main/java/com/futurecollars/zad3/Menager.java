package com.futurecollars.zad3;

public class Menager extends BaseEmployee {

    protected int bonusSalary = 500;
    protected int baseSalary = 5000;

    public Menager(String name, String lastname, int employmentYear) {
        super(name, lastname, employmentYear);
        int bonusSalary;
    }

    public void setBonusSalary(int bonusSalary) {
        this.bonusSalary = bonusSalary;
    }


    @Override
    protected int calculateMonthlySalary() {
        return baseSalary + bonusSalary;
    }
}

