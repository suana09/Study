package com.ohgiraffers.section03.map.run;

import java.util.Properties;

public class Application2 {

    public static void main(String[] args) {

        /*Properties 란?*/
        /*HashMap을 구현하여 사용 용법은 거의 유사하지만 오직 문자열만 사용할 수 있는 자료구조*/
        /*설정 파일의 값을 읽어 어플리케이션에 적용할 때 사용함*/

        Properties prop = new Properties();
        prop.setProperty("driver", "oracle.jdbc.driver.Oracle");
        prop.setProperty("url", "jdbc:oracle:thin:@127.0.0.1:1521:xe");
        prop.setProperty("user", "student");
        prop.setProperty("password", "student");

        System.out.println("prop = " + prop);

        Properties prop2 = new Properties();

        System.out.println(prop.getProperty("driver"));
        System.out.println(prop.getProperty("url"));
        System.out.println(prop.getProperty("user"));
        System.out.println(prop.getProperty("password"));

        /**/
        /**/
        /**/
        /**/
        /**/
        /**/

    }
}
