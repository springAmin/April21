package com.homework.week1.day4;

public class Singleton {

    private volatile Singleton instance;


    public  Singleton getInstance() {
        Singleton instanceRef = instance; // Prevents checking instance twice
        if (instanceRef == null) {
            synchronized (this) {  // can not call synchronized on a var to points to null?
                instanceRef = instance;
                if (instanceRef == null) {
                    instance = new Singleton();
                    instanceRef = instance;
                }
            }
        }
        System.out.print(instanceRef);
        return instanceRef;
    }








}
