package com.ohgiraffers.section04.overflow;

public class Application1 {

    public static void main (String[] args){

        /* 수업목표. 오버플로우에 대해 이해할 수 있다*/
        /* 자료형의 값의 최대 범위를 벗어나는 경우, */
        /* 발생한 carry를 버림 처리하고 sign bit를 반전시켜 최소값으로 순환시킴 */


        /* 1. overflow*/
        byte num1 = 127;

        System.out.println(" num 1 : " + num1);

        num1++; //1이 증가

        System.out.println("num1 오버플로우 : "+num1);


        /* 1. underflow*/
        /* 오버플로우와 반대 개념, 최소 범위보다 작은 수를 발생시키는 경우 */

        byte num2 = -128;

        System.out.println(" num 2 : " + num2);

        num2--; //1이 감소

        System.out.println("num1 언더플로우 : "+num2);


        int firstNum = 1000000; //100만
        int secondNum = 700000; //70만

        int multi = firstNum * secondNum; //7천억이 나와야 함

        System.out.println("firstNum*secondNum = "+multi);
        // firstNum*secondNum = -79669248



        /* 3. 해결방법 */
        /* 오버플로우를 예측하고 더 큰 자료형으로 결과값을 받아서 처리 */

        long longMulti = firstNum * secondNum;

        System.out.println("firstNum * secondNum " + longMulti);
        // firstNum*secondNum = -79669248, 결과 같음
        // 이미 오버플로우가 일어난 상태에서 다른 자료형으로 바꿔도 소용X
        // >>>>>> 강제 형변환이 필요한 이유!

        long result = (long)firstNum * secondNum;

        System.out.println("result : " + result);


        /**/
        /**/
        /**/
        /**/
        /**/
        /**/
        /**/
        /**/


    }
}
