package com.futurecollars.zad4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class toUpperCaseFormatterTest {

    @Test
    void shouldUpperCase(){
        //given
        toUpperCaseFormatter toUpperCaseFormatter = new toUpperCaseFormatter();
        String text = "lubie placki";
        //when
        String result = toUpperCaseFormatter.formatText(text);
        //then
        Assertions.assertEquals("LUBIE PLACKI", result);
    }
}
