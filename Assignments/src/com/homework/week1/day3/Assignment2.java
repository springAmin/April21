package com.homework.week1.day3;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args) {
        try {
            String appendContent = "World, Hi!";
            System.out.println("Please a filename: ");

            Scanner user_input = new Scanner(System.in);
            Path path = Paths.get(user_input.nextLine());

            if (Files.isRegularFile(path)) {
                Files.write(path, appendContent.getBytes(), StandardOpenOption.APPEND);
            } else {
                System.out.println(" Filename does not point to a file, " +
                        "make sure it's not a directory");
            }
        }  catch (IOException e) {
            System.out.println("Encountered an IOException");
        }

    }




}
