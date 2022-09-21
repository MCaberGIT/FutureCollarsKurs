package com.futurecollars.zad4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareTest {

    @Test
    void shouldGetAreaOfSquare4x4() {
        //given
        Square square = new Square(4);
        //when
        double result = square.getArea();
        //then
        Assertions.assertEquals(16, result);
    }

    @Test
    void shouldGetPerimeterOfSquare4x4() {
        //given
        Square square = new Square(4);
        //when
        double result = square.getPerimeter();
        //then
        Assertions.assertEquals(16, result);
    }
}