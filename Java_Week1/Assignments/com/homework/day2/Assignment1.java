package com.homework.day2;

public class Assignment1 {

    public static void main(String[] args) {

        int sum = 0;
        for(String i : args) {
            try {
                sum += Integer.parseInt(i,10);
            } catch (NumberFormatException e) {
                System.out.println(i + " is not a number! Skipping...");
                continue;
            }
        }

        System.out.println("The total is: " + sum);
    }

}
