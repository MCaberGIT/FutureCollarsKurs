package com.lesson9.zad3;
import java.security.InvalidParameterException;

public class Calculator {
    public double upgradedCalculate(CalculatorOperation calculatorOperation, double left, double right) {

        if (calculatorOperation == null) {
            throw new InvalidParameterException("Cannot perform operation");
        }
        return calculatorOperation.calculate(left, right);
    }
}