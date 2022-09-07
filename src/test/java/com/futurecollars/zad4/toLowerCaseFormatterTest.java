package com.futurecollars.zad4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class toLowerCaseFormatterTest {

    @Test
    void shouldLowerCase() {
        //given
        toLowerCaseFormatter toLowerCaseFormatter = new toLowerCaseFormatter();
        String text = "LUBIE PLACKI";
        //when
        String result = toLowerCaseFormatter.formatText(text);
        //then
        Assertions.assertEquals("lubie placki", result);
    }
}