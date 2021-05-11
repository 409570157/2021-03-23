package com.yuni.racing;

public class Racing {
    public static  void main(String[] args){
        Horse h1 = new Horse();
        Horse h2 = new Horse();
        Horse2 h3 = new Horse2();
        Thread th = new Thread(h3);
        th.start();
        h2.start();
        h1.start();
}
}
