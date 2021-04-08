package com.homework.week1.day1;
import java.util.Arrays;

public class Assignment1 {
    public static void main(String[] args) {
        printPattern();
    }

    /**
     * Prints the header for each triangle
     * @param numTriangle - the triangle being printed
     */
    public static void header(int numTriangle) {
        System.out.println(numTriangle + ")");
    }

    /**
     * Prints a series of symbols
     * @param numSymbol - number of symbols to print
     */
    public static void printSymbols(int numSymbol, char symbol) {
        char[] symbols = new char[numSymbol];
        Arrays.fill(symbols, symbol);
        System.out.print(symbols);
    }

    public static void line(int numDots) {
        printSymbols(numDots, '.');
        System.out.print('\n');
    }

    /**
     * Prints Patterns
     * Note: Multiple "magic" numbers are present, a more
     * standarized approach could be taken, for example
     * by having one function that prints triangles
     * and another that centers them, however since there
     * are no req that approach has not been taken
     */
    public static void printPattern() {
        // Pattern Number 1
        header(1);
        for(int i = 1; i < 5; i++) {
            printSymbols(i, '*');
            System.out.print('\n');
        }
        line(9);
        System.out.print('\n');


        // Pattern Number 2
        header(2);
        line(10);
        for(int i = 1; i < 5; i++) {
            printSymbols(5-i,'*');
            System.out.print('\n');
        }
        System.out.print('\n');


        // Pattern Number 3
        header(3);
        for(int i = 0; i < 4; i++) {
            printSymbols(5-i,' ');
            printSymbols(1+(2*i), '*');
            printSymbols(5-i,' ');
            System.out.print('\n');
        }
        line(11);
        System.out.print('\n');


        // Pattern Number 4
        header(4);
        line(12);
        for(int i = 3; i >= 0; i--) {
            printSymbols(5-i,' ');
            printSymbols(1+(2*i), '*');
            printSymbols(5-i,' ');
            System.out.print('\n');
        }
    }
}
