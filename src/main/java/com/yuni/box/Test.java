package com.yuni.box;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Box3 box3 = new Box3();
        Box[] boxes = {new Box1(),new Box2(), new Box3(),new Box4(),new Box5() };
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int length = Integer.parseInt(scan.next());
        System.out.println("Please enter a number:");
        int width = Integer.parseInt(scan.next());
        System.out.println("Please enter a number:");
        int height = Integer.parseInt(scan.next());
        System.out.println("length: " + length + ", width: " + width + ", height: " + height);
        if (box3.validate(length, width, height)) {
            System.out.println(box3.getName());
        }


    }


}

