package com.week1.day5;

import com.homework.week1.day5.EvenOdd;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class EvenOddTest {
    EvenOdd method = new EvenOdd();

    List<Integer> integerTest = Arrays.asList(new Integer[]{1,23,5,754,999});

    @Test
    public void evenOddTest() {
        System.out.println(method.evenOdd(integerTest));
        assertEquals("(o1,o23,o5,e754,o999)", method.evenOdd(integerTest));
    }

}
