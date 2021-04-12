package com.week1.project;

import com.homework.week1.project.Recursion;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class RecursionTest {
    Recursion rec = new Recursion();


    ArrayList<Integer> integerTest = new ArrayList<>(Arrays.asList(new Integer[]{1,1,4,12,999}));
    ArrayList<Integer> integerTestEnd = new ArrayList<>(Arrays.asList(new Integer[]{1,3,5,17,9,9}));
    ArrayList<Integer> integerTestTrue = new ArrayList<>(Arrays.asList(new Integer[]{2,7,1998,4}));


    @Test
    public void doubleGroupTest() {
        assertEquals(false,
                rec.groupSumClump(0, integerTest, 5));
    }

    @Test
    public void endTest() {
        assertEquals(false,
                rec.groupSumClump(0, integerTestEnd, 10));
    }

    @Test
    public void trueTest() {
        assertEquals(true,
                rec.groupSumClump(0, integerTestTrue, 6));
    }

}
