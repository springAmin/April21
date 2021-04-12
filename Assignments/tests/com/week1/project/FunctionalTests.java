package com.week1.project;

import com.homework.week1.project.Functional;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FunctionalTests {

    Functional func = new Functional();

    List<String> stringTest = Arrays.asList(new String[]{"hellxo", "yexs", "x"});
    List<String> stringTestCorrect = Arrays.asList(new String[]{"hello", "yes", ""});
    List<Integer> integerTest = Arrays.asList(new Integer[]{1,23,5,754,999});
    List<Integer> integerTestDigitCorrect = Arrays.asList(new Integer[]{1,3,5,4,9});
    List<Integer> integerTestDoubleCorrect = Arrays.asList(new Integer[]{2,46,10,1508,1998});


    @Test
    public void rightDigitTest() {
        assertEquals(integerTestDigitCorrect, func.rightDigit(integerTest));
    }

    @Test
    public void doublingTest() {
        assertEquals(integerTestDoubleCorrect, func.doubling(integerTest));
    }

    @Test
    public void noXTest() {
        assertEquals(stringTestCorrect, func.noX(stringTest));
    }

}
