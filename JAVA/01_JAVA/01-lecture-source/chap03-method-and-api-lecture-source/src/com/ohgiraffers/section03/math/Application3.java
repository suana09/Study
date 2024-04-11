package com.ohgiraffers.section03.math;

import java.util.Random;

public class Application3 {
    public static void main(String[] args) {
        /*수업목표. java.util.Random 클래스를 활용하여 사용자 범위의 난수를 발생시킬 수 있다*/

        /*java.util.Random (className)*/
        /*java.util.Random (className) nextInt() 메소드를 이용한 난수 발생*/
        /*nextInt(int bound) : 0부터 매개변수로 전달 받은 정수 범위까지의 난수를 발생시킨 뒤 정수 형태로 반환*/
        /**/
        /*암어메스메스메스메스메스메스메스메스 암어메스인더스트레스어쩌구저쩌구 피어리스쎄이예스*/

        /*random.nextInt(구하려는 난수의 갯수) + 구하려는 난수의 최소값*/

        Random random = new Random();

        /*1. 0부터 9까지 난수발생*/
        int randomNum1 = random.nextInt(10);
        System.out.println("0 ~ 9 난수 : "+randomNum1);

        /*2. 1부터 10까지 난수발생*/
        int randomNum2 = random.nextInt(10)+1;
        System.out.println("1 ~ 10 난수 : "+randomNum2);

        /*3. 20 ~ 45 난수발생*/
        int randomNum3 = random.nextInt(26)+20;
        System.out.println("20 ~ 45 난수 : "+randomNum3);

        /*4. -128 ~ 127 난수발생*/
        int rann = new Random().nextInt(256) - 128;
        System.out.println("-128 ~ 127까지의 난수 발생 : "+rann);
    }
}
