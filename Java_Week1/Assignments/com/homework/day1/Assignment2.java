package com.homework.day1;
import java.util.Random;
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        // Create Random Number
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;

        // Ask users to guess
        Scanner guess = new Scanner(System.in);
        int guessesLeft = 5;
        System.out.println("Please guess a number between 1-100");
        while(guessesLeft > 0) {
            int numGuessed;

            try {
                numGuessed = Integer.parseInt(guess.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("That's not a valid number! ");
                continue;
            }

            if (Math.abs(numGuessed - randomNumber) <= 10) { // This assumes inclusive range
                System.out.println("You guessed correctly! The number is " + randomNumber);
                return;
            } else if (guessesLeft > 1) {
                System.out.println("That not quite right, try again! ");
            }
            guessesLeft--;

        }
        System.out.println("Sorry the number is " + randomNumber);
    }
}
