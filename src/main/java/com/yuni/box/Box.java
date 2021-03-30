package com.yuni.box;

public class Box {
    int length;
    int width;
    int height;
    public Box(){
        super();
    }
    public boolean validate(int a, int b, int c) {
        return (a <= length && b <= width && c <= height);
    }
}
