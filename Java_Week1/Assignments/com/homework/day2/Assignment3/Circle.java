package com.homework.day2.Assignment3;

public class Circle implements Shape {

    public final static double PI = 3.14159265359;

    Circle(int radius_in) {
        this.radius = radius_in;
    }

    /**
     * Returns calculated area of circle
     */
    @Override
    public double calculateArea() {
        return (PI*radius*radius);
    }

    /**
     * Prints area of Circle to standard out
     */
    @Override
    public void display() {
        System.out.println("Circle Area: " + calculateArea());
    }

    private int radius;
}
