package com.ohgiraffers.level01.basic;

public class Application01 {
    public static void main(String[] args) {


        int a = 10;
        int b = 20;
        int c = 5;

        Calculator obj = new Calculator();
        obj.checkMethod();

        System.out.println("10 + 20 = "+obj.sumTwoNumber(a, b));
        System.out.println("10 - 5 = "+obj.minusTwoNumber(a, c));
        System.out.println("10 * 5 = "+obj.multiTwoNumber(a, c));
        System.out.println("10 / 5 = "+obj.divideTwoNumber(a, c));


    }
}
