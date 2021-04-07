package com.homework.day2.Assignment3;

public class Rectangle implements Shape{

    Rectangle(int height_in, int width_in) {
        this.height = height_in;
        this.width = width_in;
    }



    /**
     * Returns calculated area of shape
     */
    @Override
    public double calculateArea() {
        return (height*width);
    }


    private int height;
    private int width;
}
