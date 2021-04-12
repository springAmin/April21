package com.week1.day5;

import org.junit.Test;

import com.homework.week1.day5.DataTimeSol;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DateTest {
    DataTimeSol methods = new DataTimeSol();
    LocalDateTime myBirthday = LocalDateTime.parse("2012-02-20T06:30:00");
    LocalDateTime friday13th = LocalDateTime.parse("2020-11-13T06:30:00");

    LocalDateTime prevThursCorrect = LocalDateTime.parse("2012-02-16T06:30");

    ArrayList<Integer> daysPerMonth = new ArrayList<>(
            Arrays.asList(new Integer[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}));

    List<String> datesCorrect = Arrays.asList(new String[]{"2021-02-01",
            "2021-02-08", "2021-02-15", "2021-02-22", "2021-03-01", "2021-03-08"});


    @Test
    public void prevThursdayTest() {
        assertEquals(prevThursCorrect, methods.prevThursday(myBirthday));
    }

    @Test
    public void monthLengthTest() {
        assertEquals(daysPerMonth, methods.monthLength(2021));
    }

    @Test
    public void findMondayTest() {
        assertEquals(datesCorrect, methods.findMonday(2));
    }

    @Test
    public void isUnluckyTest() {
        assertEquals(false, methods.isUnlucky(myBirthday));
        assertEquals(true, methods.isUnlucky(friday13th));
    }


}
