package com.homework.week1.day3;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;


public class Assignment3 {
    public static void main(String[] args) {
        System.out.println(args.length);
        // Requires: one argument provided in the form of one char
        if(!(args.length == 1) ||
                !(args[0].length() == 1)) {
            System.out.println("Exiting... Please provide a single character");
            return;
        }

        char match = args[0].charAt(0);
        int numMatch = 0;

        try(BufferedReader buf = new BufferedReader(new FileReader("hello.txt"))) {
            int value;
            while((value = buf.read()) != -1) {
                if ((char)value == match) {
                    numMatch++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Found " + numMatch + " matching character(s)");


    }
}
