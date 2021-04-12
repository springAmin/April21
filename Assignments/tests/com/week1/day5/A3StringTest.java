package com.week1.day5;

import com.homework.week1.day5.A3String;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class A3StringTest {
    A3String method = new A3String();

    List<String> stringTest = Arrays.asList(new String[]{"aMy", "yes", "ayello"});
    List<String> stringCorrect = Arrays.asList(new String[]{"aMy"});


    @Test
    public void findStringTest() {
        assertEquals(stringCorrect, method.findString(stringTest));
    }

}
