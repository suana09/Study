package com.ohgiraffers.section03.interfaceimplement;

public interface InterProduct extends java.io.Serializable/*, java.util.Comparator*/ {

    /*인터페이스가 인터페이스를 상속받을 시에는 extends 키워드를 사용하며,*/
    /*이 때는 여러 인터페이스를 다중 상속 받을 수 있다.*/


    /*인터페이스는 상수 필드만 작성 가능하다*/
    /*public static final 제어자 조합을 상수 필드라고 부른다*/
    /*반드시 선언과 동시에 초기화해야 한다*/

    public static final int MAX_NUM = 100;

    /*상수필드만 가질 수 있기 때문에 모든 필드는 묵시적으로 public static final이다*/
    int MIN_NUM = 10; //이거처럼 명시적으로 상수임을 작성하지 않아도 ㄱㅊ다는 의미

    /*인터페이스는 생성자를 가질 수 없다.*/
    //public interProduct(){} //error

    /*인터페이스는 구현부가 있는 non-static method 를 가질 수 없다*/
    //public void nonStaticMethod(){}; //error

    /*추상 메소드는 가능하다*/
    public abstract void nonStaticMethod();

    /*인터페이스 안에 작성한 메소드는 묵시적으로 public abstract 이다. (다른 접근제한자 사용불가)*/
    /*따라서 인터페이스 메소드를 오버라이딩 하는 경우*/
    /*반드시 접근제한자를 public으로 해야 오버라이딩이 가능하다.*/

    void absMethod1(); //정상작동, public abstract 의

    /*but static method는 구현부가 있는 메소드 작성이 가능하다. (JDK 1.8에 추가된 기능)*/
    public static void staticMethod(){
        System.out.println("interProduct 클래스의 staticMethod 호출됨...");
    }

    /*default 키워드 사용시 body가 있는 non-static method 작성 가능 (JDK 1.8에 추가된 기능)*/
    public default void defaultMethod(){
        System.out.println("interProduct 클래스의 defaultMethod 호출됨...");
    }

    public abstract void abMethod();

    //

    /**/
    /**/



}
