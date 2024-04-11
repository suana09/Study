package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class C_doWhile {

    public void testSimpleDoWhileStatement(){
        /*do-while문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다*/
        /**/
        /*[do-while문 표현식]*/

        /* <<<do-while statement format>>>
        초기식;
        do {
            1회차에는 무조건 실행, 이후에는 조건식을 확인하여 조건을 만족하는 경우 반복할 코드;
            증감식;
        }
        while(조건식);

        */
        /**/
        /**/

        do{
            System.out.println("최초 한 번 동작함///");

        }
        while(false);
        System.out.println("반복문 종료 확인");

    }

    public void testDoWhileExample(){
        /*do-While문의 흐름을 이해하고 적용할 수 있다.*/
        /*키보드로 문자열 입력을 받아 반복적으로 출력*/
        /*단, exit가 입력되면 반복문 종료*/

        Scanner sc = new Scanner(System.in);
        String str = "";





        do{

            System.out.println("입력하세요");
            str = sc.nextLine();

            /*문자열은 == 비교가 불가능. 문자열이 같은지 다른지 비교하기 위해서는 str.equals / !str.equals를 사용해야 함*/
            System.out.println(str);
        }while(!str.equals("exit"));

        System.out.println("프로그램 종료");

    }

}
