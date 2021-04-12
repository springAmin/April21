package com.homework.week1.day5;

import java.nio.file.Files;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda {
    public static int compare(String lhs, String rhs) {
        return rhs.contains("e") ? lhs.contains("e") ? 0: 1 :lhs.contains("e") ? -1: 1;
    }

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList(new String[]{"earliest", "myworld", "this", "hello", "yes",
                "x","yea", "elephant", "howdy", "eardrums"});


        // Length Shortest to Longest
        stringList.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);

        System.out.println("");

        // Longest to Shortest
        stringList.stream().sorted((lhs, rhs) -> rhs.length() - lhs.length()).forEach(System.out::println);

        System.out.println("");

        // By First Character
        stringList.stream().sorted((lhs, rhs) ->  lhs.charAt(0) - rhs.charAt(0)).forEach(System.out::println);

        System.out.println("");

        // By E first
        // Note, This is bad code quality, nested ternary is unreadable, instead just use if else
        stringList.stream().sorted((lhs, rhs) ->
                rhs.contains("e") ? lhs.contains("e") ? 0 : 1 :
                        lhs.contains("e") ? -1: 1).forEach(System.out::println);

        System.out.println("");

        // By E First, but with Static
        stringList.stream().sorted(Lambda::compare).forEach(System.out::println);

    }



}
