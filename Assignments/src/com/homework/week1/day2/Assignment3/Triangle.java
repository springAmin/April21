package com.homework.week1.day2.Assignment3;

public class Triangle implements Shape{

    Triangle(int height, int base) {
        this.height = height;
        this.base = base;
    }

    Triangle(int height, int base, int gamma) {
        this(height, base);
        this.gamma = gamma;
    }

    /**
     * Returns calculated area of triangle
     */
    @Override
    public double calculateArea() {
        return ((height*base) / 2.0);
    }

    /**
     * Prints area of Triangle to standard out
     */
    @Override
    public void display() {
        System.out.println("Triangle Area: " + calculateArea());
    }


    private int height;
    private int base;
    private int gamma;
}
