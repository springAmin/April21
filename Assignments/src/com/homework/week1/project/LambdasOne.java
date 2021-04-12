package com.homework.week1.project;


import java.util.function.Predicate;

public class LambdasOne {

    public static Predicate<Integer> isOdd() {
        return (n) -> {
            if ((n % 2) == 0) {
                return false;
            }
            return true;
        };
    }

    public static Predicate<Integer> isPrime(){
        return (n) -> {
            if (((n % 2) == 0) && n != 2) {
                return false;
            }
            for(int i = 3; i < n; i++) {
                if ((n % i) == 0) {
                    return false;
                }
            }
            return true;
        };
    }

    public static Predicate<Integer> isPalindrome() {
        return (n) -> {
            String num = String.valueOf(n);
            for (int i = 0, j = num.length() - 1; i < j; i++, j--) {
                if (num.charAt(i) != num.charAt(j)) {
                    return false;
                }
            }
            return true;
        };
    }

}
