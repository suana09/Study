package com.ohgiraffers.section06.ternary;

public class Application1 {
    public static void main (String[] argv){

        /*수업목표. 삼항연산자를 이해하고 활용할 수 있다 */
        /*삼항연산자*/
        /*자바에서 유일하게 피연산자의 항목이 3개인 연산자이다*/
        /*항목이 3개임 >*/
        /*format: (조건식)? 참일때 사용할 값1: 거짓일 때 사용할 값2*/
        /*조건식은 반드시 결과가 true or false가 나오게 작성해야 한다*/
        /*비교/논리연산자가 주로 사용된다*/

        /*삼항연산자의 단독 사용*/
        int num1 = 10;
        int num2 = -10;
        String result = (num1>0)? "양수입니다" : "양수가 아닙니다." ;
        System.out.println("num1은 " + result);
        //내가 결과값을 어떤 data type으로 받을지에 따라 result의 자료형이 달라져야 함

        String result2 = (num2>0)? "양수입니다" : "양수가 아닙니다" ;
        System.out.println("num2은 " + result2);

        //궁금: 삼항연산자의 true/false 결과값은 둘 다 같은 data type 이어야 하는가

        /*삼항연산자의 중첩 사용*/
        int num3 = 5;
        int num4 = 0;
        int num5 = -5;

        String result3 = (num3>0)? "양수다" : (num3==0)? "0이다":"음수이다";
        //true일때 : "양수다" / false일때: 오른쪽 항 실행

        String result4 = (num4>0)? "양수다" : (num4==0)? "0이다":"음수이다";
        String result5 = (num5>0)? "양수다" : (num5==0)? "0이다":"음수이다";

        System.out.println("num3은 "+result3);
        System.out.println("num4은 "+result4);
        System.out.println("num5은 "+result5);




        /**/
        /**/


    }
}
