package com.ohgiraffers.section02.userexception;

public class Application1 {
    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        try {
            //et.checkEnoughMoney(10000, 150000);
            et.checkEnoughMoney(-500000, 10000);
            //et.checkEnoughMoney(10000, -20000);
            //et.checkEnoughMoney(50000, 30000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
