package com.yuni.racing;

public class Horse2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("R" + " " + i);
        }
    }
}
