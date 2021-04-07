package com.homework.day2.Assignment3;

public class Circle implements Shape {

    public final static double PI = 3.14159265359;

    Circle(int radius_in) {
        this.radius = radius_in;
    }



    /**
     * Returns calculated area of shape
     */
    @Override
    public double calculateArea() {
        return (PI*radius*radius);
    }


    private int radius;
}
