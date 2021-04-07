package com.homework.day2.Assignment3;

public interface Shape {

    /**
     * Returns calculated area of shape
     */
    double calculateArea();

    /**
     * Prints area of shape to standard out
     */
    default void display() {
        System.out.println(calculateArea());
    }
}
