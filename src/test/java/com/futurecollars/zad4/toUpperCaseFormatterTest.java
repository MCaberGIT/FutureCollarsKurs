package com.futurecollars.zad4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class toUpperCaseFormatterTest {

    @Test
    void shouldUpperCase(){
        //given
        ToUpperCaseFormatter toUpperCaseFormatter = new ToUpperCaseFormatter();
        String text = "lubie placki";
        //when
        String result = toUpperCaseFormatter.formatText(text);
        //then
        Assertions.assertEquals("LUBIE PLACKI", result);
    }
}
