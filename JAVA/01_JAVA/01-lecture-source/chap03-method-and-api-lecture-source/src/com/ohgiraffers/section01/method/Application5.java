package com.ohgiraffers.section01.method;

public class Application5 {

    public static void main(String[] args) {

        /*수업목표. 메소드 리턴에 대해 이해할 수 있다.*/

        /*return 이란? */
        /*모든 메소드 내부에는 리턴이 존재한다.*/
        /*void 메소드의 경우는 리턴을 명시적으로 작성하지 않아도 마지막줄에 컴파일러가 자동으로 추가해준다.*/
        /*return은 현재 메소드를 강제 종료하고 호출한 구문으로 다시 돌아가는 명령어이다.*/
        /**/

        System.out.println("main method starts");

        Application5 app5 = new Application5();
        app5.testMethod();

        /*1. 메소드 리턴 테스트*/
        /**/

        System.out.println("main method ends");

    }

    public void testMethod (){

        System.out.println("test method working...");

        /*void 메소드의 경우 : 컴파일러에 의해 자동으로 리턴이 추가됨*/
        /*가장 마지막에 작성하고, 마지막에 작성되지 않을 경우는 컴파일 에러 발생*/
        /**/

        return;

        //System.out.println("overreturn");
        //error message: unreachable statement, return 뒤에 올 수 없으므로


    }


}
