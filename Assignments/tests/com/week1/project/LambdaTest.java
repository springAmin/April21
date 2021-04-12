package com.week1.project;

import com.homework.week1.project.LambdasOne;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class LambdaTest {
    LambdasOne lambda = new LambdasOne();


    List<Integer> integerTest = Arrays.asList(new Integer[]{0, 1,2,3,4,5,353,33533,334433, 43285});
    List<Integer> integerOdd = Arrays.asList(new Integer[]{1,3,5,353,33533,334433, 43285});
    List<Integer> integerPrime = Arrays.asList(new Integer[]{1,2,3, 5,353,33533});
    List<Integer> integerPalindrome = Arrays.asList(new Integer[]{0, 1,2,3,4,5,353,33533,334433});


    @Test
    public void isOddTest() {
        integerTest.stream().filter(lambda.isOdd()).collect(Collectors.toList());

        assertEquals(integerOdd,
                integerTest.stream().filter(lambda.isOdd()).collect(Collectors.toList()));
    }

    @Test
    public void isPrimeTest() {
        assertEquals(integerPrime,
                integerTest.stream().filter(lambda.isPrime()).collect(Collectors.toList()));
    }

    @Test
    public void isPalindromeTest() {
        assertEquals(integerPalindrome,
                integerTest.stream().filter(lambda.isPalindrome()).collect(Collectors.toList()));
    }


}
