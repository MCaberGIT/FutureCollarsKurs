package com.futurecollars.lesson6.zad5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EvenNumbersServiceTest {
    @Test
    public void shouldReturnTrueIfNumberIsEven() {
        //given
        int number = 2;
        boolean expected = true;
        //when
        boolean actual = EvenNumbersService.isNumberEven(number);
        //then
        Assertions.assertEquals(expected, actual);
    }
}