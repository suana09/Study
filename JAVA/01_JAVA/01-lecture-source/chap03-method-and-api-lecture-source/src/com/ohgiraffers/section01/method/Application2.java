package com.ohgiraffers.section01.method;

public class Application2 {
    public static void main(String[] args) {
        /*다른 흐름의 메소드 호출 흐름에 대해 이해할 수 있다*/

        /*1. methodA(), methodB(), methodC()를 차례대로 작성한다.

        2. 작성 후 메소드 호출 확인과 실행 종료 출력 구문을 확인하고 다시 현재 위치로 돌아온다.

        3. 메인메소드 시작을 확인하기 위한 출력 구문을 작성한다.*/

        System.out.println("main starts");

        Application2 objectName1 = new Application2();
        objectName1.methodA();
        objectName1.methodB();
        objectName1.methodC();

        /*5. 메인 메소드 종료를 확인하는 출력구문을 작성한다.*/

        System.out.println("main ends");

        /*6. main을 실행하여 전체적인 소스 흐름을 파악한다*/

    }

    public void methodA(){
        System.out.println("정규수업 시작함");
        System.out.println("정규수업 끝남");

    }

    public void methodB(){

        System.out.println("취업특강 시작함");
        System.out.println("취업특강 끝남");


    }

    public void methodC(){
        System.out.println("선생님과 상담하는 날입니다");
        System.out.println("선생님과의 상담이 끝났습니다");

    }

}
