package com.yuni.testing;

import com.yuni.box.Box;
import com.yuni.box.Box1;
import com.yuni.box.Box2;
import com.yuni.stu.Student;

import java.util.ArrayList;
import java.util.TreeSet;

public class Array {
    public static void main(String[] args) {

        TreeSet<Integer> aa = new TreeSet<>();
        System.out.println(aa.size());
        aa.add(1);
        aa.add(2);
        aa.add(3);
        System.out.println(aa.size());
        for (int i = 0; i < 4; i++) {
            System.out.println(aa.size());
        }
    /*    Integer n = new Integer(123);
        Float f = new Float(1);
        Boolean b = new Boolean(true);*/
        /*Long Byte Character String */
      /*  ArrayList list = new ArrayList();
        list.add("Eunice");
        list.add(1);
        list.add(true);
        Student student = new Student();
        list.add(student);
        String name = (String) list.get(0);
        Box1 box1 = new Box1();
        Box2 box2 = new Box2();
        ArrayList<Box> boxes= new ArrayList<Box>();*/
    }
}
