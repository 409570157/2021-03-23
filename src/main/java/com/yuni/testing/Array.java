package com.yuni.testing;

import com.yuni.stu.Student;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        Integer n = new Integer(123);
        Float f = new Float(1);
        Boolean b = new Boolean(true);
        /*Long Byte Character String */
        ArrayList list = new ArrayList();
        list.add("Eunice");
        list.add(1);
        list.add(true);
        Student student = new Student();
        list.add(student);
        String name = (String) list.get(0);
    }
}
