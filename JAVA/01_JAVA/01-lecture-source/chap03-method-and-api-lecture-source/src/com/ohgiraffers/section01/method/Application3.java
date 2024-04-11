package com.ohgiraffers.section01.method;

public class Application3 {
    public static void main(String[] args) {

        /*수업목표. 메소드 전달인자와 매개변수에 대해 이해하고 메소드 호출 시 사용할 수 있다*/

        /*전달인자 (argument) 와 매개변수 (parameter) 를 이용한 메소드 호출*/
        /*지금까지 우리가 배운 변수는 지역변수에 해당*/

        /*변수의 종류*/
        /*1. 지역변수*/
        /*2. 매개변수*/
        /*3. 전역변수(필드)*/
        /*4. 클래스(static)변수*/

        /*지역변수란? :선언한 메소드 블럭 내부에서 사용 가능한 변수. 이것을 지역변수의 스코프라고 함*/
        /*다른 메소드간 서로 공유해야하는 값이 존재하는 경우 메소드 호출시 괄호를 이용하여*/
        /*값을 전달할 수 있음.*/
        /*이때 전달하는 값을 전달인자 (argument) 라고 함*/
        /*메소드 선언부 괄호안에 argument를 받기 위해 선언하는 변수를 매개변수 (parameter) 라고 부름*/

        Application3 app3 = new Application3();

        /*전달인자와 매개변수를 이용한 메소드 호출 테스트*/

        /*1. argument로 값을 전달해보기*/

        app3.test1(40);
        //40: argument
        //app3.test1("40"); //parameter는 int type이지만 argument가 String type이기 때문에 호출 불가

        //app3.test1(50, 60, 70, 80); //매개변수는 int이지만 인자는 3개이기 때문에 호출할 수 없다.

        /*2. 변수에 저장한 값을 전달해보기*/
        /*2-1. 변수에 저장한 값을 이용하여 값을 전달할 수 있다*/
        int age=20; //local parameter
        app3.test1(age); //지역변수의 값을 parameter로

        /*2-2. 자동형변환을 이용하여 값을 전달할 수 있다*/
        byte byteAge = 10;
        app3.test1(byteAge); //매개변수(argument)의 전달인자(parameter)의 이름은 같지 않아도 O

        /*2-3. 강제형변환을 이용하여 값을 전달할 수 있다*/
        long longAge = 80;
        //app3.test1.(longAge); // 자동형변환을 할 수 없어서 에러 발생
        app3.test1((int)longAge); //데이터 손실에 주의

        /*2-4. 연산결과를 이용하여 값을 전달할 수 있다*/
        app3.test1(age+6);


        /**/
        /**/


    }

    public void test1(int age){ //메소드 선언부에 들어가는 변수: 매개변수 (argument)
        //int age : parameter
        System.out.println("당신의 나이는 " + age + "세 입니다.");

    }

}
