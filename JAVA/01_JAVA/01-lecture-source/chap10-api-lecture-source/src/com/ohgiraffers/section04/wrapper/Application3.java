package com.ohgiraffers.section04.wrapper;

public class Application3 {
    /*기본자료형의 값을 문자열로 변경할 수 있다.*/

    /*valueOf() : 기본자료형을 Wrapper 클래스 타입으로 변환시키는 메소드*/
    /*toString() : 필드값을 문자열로 반환하는 메소드*/

    //valueOf : 각 wrapper class에서 제공되는 메소드
    String b = Byte.valueOf((byte) 1).toString();
    String s = Short.valueOf((short) 2).toString();
    String i = Integer.valueOf((int) 4).toString();
    String l = Long.valueOf((long) 8L).toString();
    String f = Float.valueOf((float) 4.0).toString();
    String d = Double.valueOf((double) 8.0).toString();
    String b1 = Boolean.valueOf((boolean) true).toString();
    String c = Character.valueOf((char) 'a').toString();


    /*String 클래스의 valueOf() 를 사용할수도 있다.*/

    String str = String.valueOf(10);

    /*문자열 합치기를 이용해 String 타입으로 변환할 수도 있다.*/
    String str2 = 123+"";
    /**/
    /**/
    /**/
    /**/
}
