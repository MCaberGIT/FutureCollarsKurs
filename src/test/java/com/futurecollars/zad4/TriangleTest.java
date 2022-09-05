package com.futurecollars.zad4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleTest {

    @Test
    void shouldGetAreaOfTriangleWithEdges3_4_5andHeight4() {
        //given
        Triangle triangle = new Triangle(3, 4, 5, 4);

        //when
        double area = triangle.getArea();

        //then
        Assertions.assertEquals(6, area);
    }

    @Test
    void shouldGetPerimeterOfTriangleWithEdges3_4_5andHeight4() {
        //given
        Triangle triangle = new Triangle(3, 4, 5, 4);

        //when
        double perimeter = triangle.getPerimeter();

        //then
        Assertions.assertEquals(12, perimeter);
    }
}