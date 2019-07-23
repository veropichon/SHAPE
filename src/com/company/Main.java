package com.company;

import java.text.DecimalFormat;

public class Main {

        public static void main(String[] args) {

            DecimalFormat f = new DecimalFormat();
            f.setMaximumFractionDigits(2);


            Rectangle rectangle = new Rectangle(10,20);
            System.out.println( rectangle.shapeArea());

           Triangle triangle = new Triangle(15,10);
            System.out.println(triangle.shapeArea());

           Circle circle = new Circle(10);
            System.out.printf("%.2f",circle.shapeArea());



	// write your code here
    }
}
