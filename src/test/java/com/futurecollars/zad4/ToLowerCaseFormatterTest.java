package com.futurecollars.zad4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ToLowerCaseFormatterTest {

    @Test
    void shouldLowerCase() {
        //given
        ToLowerCaseFormatter toLowerCaseFormatter = new ToLowerCaseFormatter();
        String text = "LUBIE PLACKI";
        //when
        String result = toLowerCaseFormatter.formatText(text);
        //then
        Assertions.assertEquals("lubie placki", result);
    }
}