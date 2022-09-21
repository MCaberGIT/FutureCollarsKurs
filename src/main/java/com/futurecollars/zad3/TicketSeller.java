package com.futurecollars.zad3;

public class TicketSeller extends  Employee {

    public TicketSeller(String name, String surname, int workExp){
        super(name , surname , workExp );
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + workExp() + " " + salary;
    }
}
