package com.futurecollars.zad3;

public class Manager extends  Employee{

   final int salary = 5000;

    public int managerSalary()
    {return  this.salary + bonus;}

    public  Manager(String name, String surname, int workExp){
        super(name,surname,workExp);

    }
    @Override
    public String toString(){return name + " "+ surname + " "+ workExp() + " " + managerSalary(); }
}
