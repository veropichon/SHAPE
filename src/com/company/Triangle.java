package com.company;

public class Triangle implements Shape {

    private double heigth;
    private double width;

    public Triangle(double heigth, double width) {
        this.heigth = heigth;
        this.width = width;
    }

    @Override
    public double shapeArea() {
        return heigth * width / 2;

    }
}
