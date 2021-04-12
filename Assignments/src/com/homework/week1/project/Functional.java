package com.homework.week1.project;

import java.util.List;
import java.util.stream.Collectors;

public class Functional {


    /**
     * Returns a right most digit
     * Requires base 10 numbers
     * @param in - List of Integers
     * @return
     */
    public static List<Integer> rightDigit(List<Integer> in) {
        return in.stream().map((i) -> i % 10).collect(Collectors.toList());
    }

    /**
     * Returns back doubled list of integers
     * Ex: [2,4,5] --> [4,8,10]
     * @param in - List of Integers
     * @return
     */
    public static List<Integer> doubling(List<Integer> in) {
        return in.stream().map((i) -> i * 2).collect(Collectors.toList());
    }


    /**
     * Remove lowercase "x" character from List of strings
     * @param in - List of Strings
     * @return
     */
    public static List<String> noX(List<String> in) {
        return in.stream().map((i) -> i.replace("x", "")).collect(Collectors.toList());
    }
}
