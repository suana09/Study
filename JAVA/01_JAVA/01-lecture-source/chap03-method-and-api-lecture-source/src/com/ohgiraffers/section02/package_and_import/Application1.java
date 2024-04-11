package com.ohgiraffers.section02.package_and_import;

public class Application1 {

    public static void main(String[] args) {

        /*수업목표. 패키지에 대해 이해할 수 있다*/
        /*패키지란?*/
        /*서로 관련된 클래스 또는 인터페이스 등을 모아 하나의 묶음으로 단위를 구성한 것을 말한다*/
        /*같은 패키지 내에서는 동일한 이름의 클래스를 만들 수 없지만, 패키지가 다르면 동일한 이름의 클래스를 생성 가능하다*/
        /* ** 클래스명에는 원래 패키지명이 포함되어있기 때문 !!*/
        /*ex) com.ohgiraffers.section01.method.Calculator*/

        /*그러므로 서로 다른 패키지의 클래스를 사용할 경우에는 클래스명 앞에 패키지명을 명시하여 풀 클래스 이름으로 사용하여야 한다*/

        /*1. non-static method의 경우*/
        com.ohgiraffers.section01.method.Calculator cal = new com.ohgiraffers.section01.method.Calculator();
        //객체 cal 생성

        int min = cal.minNumberOf(30, 20);

        System.out.println("30과 20중에 더 작은 값은? "+min);

        /*2. static method의 경우*/

        int max = com.ohgiraffers.section01.method.Calculator.maxNumberOf(30,20);

        System.out.println("30과 20중에 더 작은 값은? "+max);

    }
}
