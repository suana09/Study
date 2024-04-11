package com.ohgiraffers.section03.math;

public class Application2 {
    public static void main(String[] args) {
        /*컴퓨터를 나대신 일시키는 법 배우는중*/

        /*사용자 지정 범위의 난수를 발생시킬 수 있다*/
        /*난수의 활용*/
        /*Math.random()을 이용해 발생한 난수는 0부터 1천 사이의 실수 범위의 난수값을 반환한다.*/

        /*원하는 범위의 난수를 구하는 공식*/
        /*(int)(Math.random * 구하려는 난수의 갯수) + 구하려는 난수의 최소값 */

        /*1. 0~9까지 난수 발생*/
        int randomNum1 = (int)(Math.random()*10);
        System.out.println("0부터 9 사이의 난수 : "+randomNum1);

        /*2. 1~10까지의 난수 발생*/
        int randomNum2 = (int)(Math.random()*10)+1;
        System.out.println("1부터 10 사이의 난수 : "+randomNum2);

        /*3. 10~15까지의 난수 발생*/
        int randomNum3 = (int)(Math.random()*6)+10;
        System.out.println("10부터 15 사이의 난수 : "+randomNum3);

    }
}
