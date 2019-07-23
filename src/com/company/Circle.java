package com.company;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double shapeArea() {
        return radius*radius*Math.PI;
    }
}
