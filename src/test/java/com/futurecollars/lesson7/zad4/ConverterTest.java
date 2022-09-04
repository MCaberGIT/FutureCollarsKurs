package com.futurecollars.lesson7.zad4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConverterTest {
    @Test
    public void shouldMinutesConvertToSeconds(){
        //given
        long minutes = 1;
        long expected = 60;
        //when
        long actual = Converter.convertMinutesToSeconds(minutes);
        //then
        Assertions.assertEquals(expected, actual);
    }
}
