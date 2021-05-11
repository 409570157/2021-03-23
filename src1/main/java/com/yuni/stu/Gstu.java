package com.yuni.stu;

public class Gstu extends Student implements  Mailer{
    int thesis;
    public Gstu(String name,int english,int math,int thesis){
        super(name, english,math);
        this.thesis = thesis;


    }
   public void mail(){

   }
}
