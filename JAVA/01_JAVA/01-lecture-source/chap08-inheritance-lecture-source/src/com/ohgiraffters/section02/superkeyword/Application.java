package com.ohgiraffters.section02.superkeyword;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        /*수업목표. super와 super()에 대해 이해할 수 있다.*/

        /*super : 자식클래스를 이용하여 객체를 생성할 때 부모 생성자를 호출하여 부모 클래스의*/
        /*      인스턴스도 함께 생성하게 됨. super 는 이 때 생성한 부모의 인스턴스 주소를 보관하는 레퍼런스 변수.*/
        /*      자식클래스 내의 모든 생성자와 메소드 내에서 별도의 선언이 필요없이 사용할 수 있음*/
        /*super() : 부모 생성자를 호출하는 구문으로 인자와 매개변수 타입, 갯수, 순서가 일치하는 부모생성자를 호출함.*/
        /*      this()가 해당 클래스 내의 다른 생성자를 호출하는 구문이라면 super()는 부모클래스가 가지는 private 생성자를*/
        /*      제외한 나머지 생성자를 호출할 수 있도록 하는 구문.*/

        Product product1 = new Product();
        System.out.println("product1.getInformation() = "+product1.getInfomation());

        Product product2 = new Product("S-01234", "삼성", "갤럭시Z플립5", 1800000, new Date());
        System.out.println("product2.getInformation() = "+product2.getInfomation());

        Computer computer1 = new Computer();
        System.out.println("computer1.getInfomation() = " + computer1.getInfomation());

        Computer computer2 = new Computer("퀼컴 스냅드래곤", 512, 12, "android");
        System.out.println("computer2.getInfomation() = " + computer2.getInfomation());

        Computer computer3 = new Computer("S-01234", "삼성", "갤럭시Z플립5", 1800000, new java.util.Date(),
                "퀼컴 스냅드래곤", 512, 12, "android" );
        System.out.println("computer3.getInfomation() = " + computer3.getInfomation());

        /**/
        /**/
        /**/
    }

}
