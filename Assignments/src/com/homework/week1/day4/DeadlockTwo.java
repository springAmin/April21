package com.homework.week1.day4;

import java.util.ArrayList;
import java.util.Random;

public class DeadlockTwo {
    public static void main(String[] args) {
        ArrayList<Integer> myBuff = new ArrayList<Integer>();
        Random rand = new Random();
        myBuff.add(rand.nextInt(25));
        myBuff.add(rand.nextInt(25));
        myBuff.add(rand.nextInt(25));

        Runnable Producer = new Runnable() {
            @Override
            public void run() {
                try {
                    Random rand = new Random();
                    synchronized (myBuff) {
                        if (myBuff.isEmpty()) {
                            myBuff.add(rand.nextInt(25));
                            myBuff.add(rand.nextInt(25));
                            myBuff.add(rand.nextInt(25));
                            myBuff.notify();
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();                }
            }
        };

        Runnable Consumer = new Runnable() {
            @Override
            public void run() {
                try {
                    synchronized (myBuff) {
                        if (!myBuff.isEmpty()) {
                            Integer getOne = myBuff.remove(myBuff.size() -1);
                            System.out.println(getOne);
                            myBuff.wait();
                        } else {
                            myBuff.wait();
                        }

                    }
                } catch (Exception e) {
                    e.printStackTrace();                }
            }
        };

        Thread producerThread = new Thread(Producer);
        Thread consumerThread = new Thread(Consumer);
        producerThread.start();
        consumerThread.start();

    }
}


