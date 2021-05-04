package com.yuni.testing;

import com.yuni.stu.Student;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Eunice");
        list.add(1);
        list.add(true);
        Student student = new Student();
        list.add(student);
    }
}
