package com.homework.day2.Assignment3;

public class Triangle implements Shape{

    Triangle(int height_in, int base_in) {
        this.height = height_in;
        this.base = base_in;
    }

    Triangle(int height_in, int base_in, int gamma_in) {
        this.height = height_in;
        this.base = base_in;
        this.gamma = gamma_in;
    }


    /**
     * Returns calculated area of shape
     */
    @Override
    public double calculateArea() {
        return ((height*base) / 2.0);
    }


    private int height;
    private int base;
    private int gamma;
}
