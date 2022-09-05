package com.futurecollars;

public class Rectangle implements GeometricFigure {
    private final double edgeR;
    private final double edgeT;

    public Rectangle(double edgeR, double edgeT) {
        this.edgeR = edgeR;
        this.edgeT = edgeT;
    }

    @Override
    public double getArea() {
        return edgeR * edgeT;
    }

    @Override
    public double getPerimeter() {
        return 2 * (edgeR + edgeT);
    }
}
