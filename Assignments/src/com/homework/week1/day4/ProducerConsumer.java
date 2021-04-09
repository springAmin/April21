package com.homework.week1.day4;
import java.util.Random;
import java.util.ArrayList; // import the ArrayList class



public class ProducerConsumer {
    public static void main(String[] args) {
        ArrayList<Integer> myBuff = new ArrayList<Integer>();

        Runnable Producer = new Runnable() {
            @Override
            public void run() {
                try {
                    while(true) {
                        Random rand = new Random();
                        synchronized (myBuff) {
                            if (myBuff.isEmpty()) {
                                myBuff.add(rand.nextInt(25));
                                myBuff.add(rand.nextInt(25));
                                myBuff.add(rand.nextInt(25));
                            }
                            myBuff.notify();
                            myBuff.wait();
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
                        while(true) {
                            if (!myBuff.isEmpty()) {
                                for(int i = 0; i < myBuff.size(); i++) {
                                    Integer getOne = myBuff.remove(i);
                                    System.out.println(getOne);
                                }
                            }
                            myBuff.notify();
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
