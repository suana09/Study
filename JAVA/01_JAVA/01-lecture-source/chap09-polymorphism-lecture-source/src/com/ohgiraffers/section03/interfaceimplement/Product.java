package com.ohgiraffers.section03.interfaceimplement;

public class Product extends Object implements InterProduct, java.io.Serializable{

    /*클래스에서 인터페이스를 상속받을 때에는 implements 키워드를 사용한다.*/
    /*또한, 인터페이스는 여러개를 상속받을 수 있으며, */
    /*extends 로 다른 클래스를 상속받는 경우에도 그것과 별개로 인터페이스 추가 상속이 가능해진다.*/
    /*단, extends 키워드를 앞에 작성하고 implements 를 뒤에 작성한다. (순서 바뀌면 에러 발생)*/
    /**/


    @Override
    public void nonStaticMethod() {
        System.out.println("InterProduct의 nonStaticMethod 오버라이딩한 메소드 호출됨...");
    }

    @Override
    public void absMethod1() {
        System.out.println("InterProduct의 absMethod 오버라이딩한 메소드 호출됨...");
    }

    //In Class which implements Interface, static method could be
    //@Override //Static methods cannot be overrided
    public static void staticMethod() {

    }

    //Extension methods (default methods) can be written in only interface

    /*public default void defaultMethod2(){}*/

    
    @Override
    public void defaultMethod() {
        System.out.println("InterProduct의 defaultMethod 오버라이딩한 메소드 호출됨");
    }

    @Override
    public void abMethod() {

    }
}
