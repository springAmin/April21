package com.homework.week1.day4;
import java.util.Random;
import java.util.ArrayList; // import the ArrayList class



public class ProducerConsumer {

    public static int bufferSize = 3;
    public static ArrayList<Integer> myBuff = new ArrayList<Integer>();





    public static void main(String[] args) {

        Runnable Producer = new Runnable() {
            @Override
            public void run() {
                try {
                    synchronized (myBuff) {
                        for(int i = 0; i < 10; i++) {
                            if(bufferSize > myBuff.size()) {
                                    myBuff.notify();
                                    myBuff.wait();
                            }
                            myBuff.add(i);
                        }
                        myBuff.notify();
                    }
                } catch (Exception e) {
                	e.printStackTrace();                }
            }
        };

        Runnable Consumer = new Runnable() {
            @Override
            public void run() {
                try {
                    for(int i = 0; i < 10; i++) {
                        synchronized (myBuff) {
                            if(myBuff.isEmpty()) {
                                myBuff.notify();
                                myBuff.wait();
                            }
                            Integer getOne = myBuff.remove(myBuff.size() -1);
                            System.out.print(getOne + " ");
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
