package com.yuni.box;

public class Box {
    String name;
    int length;
    int width;
    int height;
    public Box(){
        super();
    }
    public boolean validate(int a, int b, int c) {
        if (a <= length && b <= width && c <= height) {
            return true;
        }else return false;
    }
    public abstract String getName() {

    }


    public abstract int getPrice() {

    }
}