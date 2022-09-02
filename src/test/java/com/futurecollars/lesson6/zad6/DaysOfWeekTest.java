package com.futurecollars.lesson6.zad6;

import com.futurecollars.lesson6.zad6.DaysOfWeek;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DaysOfWeekTest {
    @Test
    public void shouldNumberConvertToDayOfWeek(){
        //given
        int number =1;
        String expected = "Monday";
        //when
        String actual = DaysOfWeek.convertNumberToDayOFWeek(number);
        //then
        Assertions.assertEquals(actual, expected);
    }
}
