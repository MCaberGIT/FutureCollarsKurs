package com.lesson9.zad3;

public class Division implements CalculatorOperation {
    private double result;

    @Override
    public double calculate(double left, double right) {
        if (right != 0) {
            result = right / left;
        }
        return result;

    }

}
