package com.futurecollars.lesson6.zad3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void shouldAddTwoNumbers() {
        //given
        double number1 = 1;
        double number2 = 2;
        double expected = 3;
        //when
        double actual = Calculator.sum(number1, number2);
        //then
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldSubtractTwoNumbers() {
        //given
        double number1 = 1;
        double number2 = 2;
        double expected = -1;
        //when
        double actual = Calculator.subtract(number1, number2);
        //then
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldMultiplyTwoNumbers() {
        //given
        double number1 = 1;
        double number2 = 2;
        double expected = 2;
        //when
        double actual = Calculator.multiply(number1, number2);
        //then
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldDivideTwoNumbers() {
        //given
        var number1 = 1;
        var number2 = 2;
        var expected = 0.5;
        //when
        var actual = Calculator.divide(number1, number2);
        //then
        Assertions.assertEquals(actual, expected);
    }

}