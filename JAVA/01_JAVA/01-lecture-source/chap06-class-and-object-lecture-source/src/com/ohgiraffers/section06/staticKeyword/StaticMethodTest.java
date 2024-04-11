package com.ohgiraffers.section06.staticKeyword;

public class StaticMethodTest {
    private int count;
    private static int count2;

    public void nonStaticMethod(){
        this.count++;
        System.out.println("nonStaticMethod 호출함...");
        System.out.println(this.count);
    }

    public static void staticMethod(){
        //this.count2; //com.ohgiraffers.section06.staticKeyword.StaticMethodTest.this. cannot be referenced from a static context
        //this.count++;
        //StaticMethodTest.count++; Non-static field cannot be referenced from a static context
        StaticMethodTest.count2++;
        System.out.println("StaticMethod 호출함...");
        System.out.println(StaticMethodTest.count2);

    }
}
