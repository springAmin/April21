package com.homework.week1.day3;


import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.Scanner;

public class Assignment1 {

    public static void main(String[] args)  {

        try {
            Files.walk(getDirectory()).forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Encountered an IO Exception");
        } catch (Exception e) {
            System.out.println("Path is not a directory"); // could do e.message()
        }
    }


    public static Path getDirectory() throws Exception {
        System.out.println("Please enter a directory path to scan: ");
        Scanner user_input = new Scanner(System.in);
        Path path = Paths.get(user_input.nextLine());
        user_input.close();
        if (!Files.isDirectory(path)) {
            throw new Exception("Path is not a Directory");
        }
        return path;
    }
}
