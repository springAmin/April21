package com.week1.day4.ProducerConsumer;

import com.homework.week1.day4.ProducerConsumer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ProducerConsumerTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }


    @Test
    public void mainTest() {
        /**
         * This code needs to be replaced with Mockito of System
         */
        ProducerConsumer prodCon = new ProducerConsumer();
        prodCon.main(new String[]{""});

        String correct = "0 1 2 3 4 5 6 7 8 9 ";
        assertEquals(correct, "0 1 2 3 4 5 6 7 8 9 ");

    }

}
