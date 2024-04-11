package com.ohgiraffers.section04.wrapper;

public class Application2 {

    /*문자열 파싱 (Parsing)에 대해 이해할 수 있다.*/

    /*parsing : 문자열 (String) 값을 기본 자료형 값으로 변경하는 것을 parsing이라고 한다.*/

    byte b = Byte.parseByte("1");
    short s = Short.parseShort("2");
    int i = Integer.parseInt("4");
    long l = Long.parseLong("8"); //8L은 안 됨
    float f = Float.parseFloat("4.0f"); //4.0f /4.0 둘 다 가능
    double d = Double.parseDouble("8.0");
    boolean b2 = Boolean.parseBoolean("true");
    char c = "abc".charAt(0); //char은 parsing X

}
