package com.futurecollars.lesson6.zad4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AgeServiceTest {
    @Test
    public void shouldReturnTrueIfAgeIsOver18() {
        //given
        int age = 18;
        boolean expected = true;
        //when
        boolean actual = AgeService.isAgeOk(age);
        //then
        Assertions.assertEquals(expected, actual);
    }
}