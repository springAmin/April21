package com.homework.week1.day4;

public class Singleton {

    private volatile static Singleton instance = null;

    public  Singleton getInstance() {
        if (instance == null) {
            synchronized (this) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        System.out.print(instance);
        return instance;
    }
}
