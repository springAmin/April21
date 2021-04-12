package com.homework.week1.day5;

import java.util.List;
import java.util.stream.Collectors;

public class EvenOdd {

    /**
     * Labels even and odd numbers
     * @param in - List of Integers
     * @return
     */
    public static String evenOdd(List<Integer> in) {
        return in.stream().map((i) -> (i % 2 == 0) ? "e" + i  : "o" + i   ).collect(Collectors.joining(",", "(", ")"));
    }

}
