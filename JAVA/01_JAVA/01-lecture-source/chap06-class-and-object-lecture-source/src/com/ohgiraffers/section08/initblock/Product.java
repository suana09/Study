package com.ohgiraffers.section08.initblock;

public class Product {
    /*1. 필드를 초기화하지 않으면 JVM 이 정한 기본값으로 객체가 생성된다.*/
/*
    private String name;
    private int price;
    private static String brand;
*/

/*

                                                      ------           ------
                                                     -      -         -      -
                                                    -        -       -        -
                                                    -         -------         -
                                                    -                         -
                                                   -                           -
                                                  -                             -
                                                 -       ■                ■      -
                                                  -              ㅡ             -
                                                   -                           -
                                                     -------------------------          토 끼







*/

    /*2. 명시적 초기화*/

    private String name = "갤럭시";
    private int price = 1000000;
    private static String brand = "삼송";

    /*인스턴스 초기화 블럭*/
    {
        name = "사이언";
        price = 900000;

        /*주의사항*/
        /*인스턴스 초기화 블럭에서는 static field를 초기화 할 수 있는 것처럼 보인다*/
        /*그러나 static 초기화 블럭은 클래스가 로드될 때 이미 기본값으로 초기화를 진행했다*/
        /*따라서 인스턴스 초기화 블럭이 동작하는 시점에는 이미 초기화가 진행된 정적 필드에*/
        /*인스턴스 초기화 블럭에서 대입한 값으로 덮어쓰기 되는 것이다.*/

        brand = "사과";
        System.out.println("인스턴스 초기화 블럭 동작함...");

    }

    static {
        /*주의사항*/
        /*static 초기화블럭에서는 non-static field를 초기화하지 못한다*/
        /*정적 초기화 블럭은 클래스 로드시에 동작한다.*/
        /*따라서 정적 초기화 블럭의 동작 시점에는 인스턴스가 아무것도 존재할 수 없기 때문에 */
        /*존재하지 않은 인스턴스 변수에 초기화 하는 것은 불가능하다*/
        /**/

        //name = "아이뽕";
        //price = 5500000;

        brand = "헬지";
        System.out.println("정적 초기화 블럭 동작함...");

        /*
        //분명 인스턴스 초기화 블럭이 더 위에 있는데도 정적 초기화 블럭이 먼저 동작했다
        static 과 non-static 의 실행시점의 차이 때문
        정적 초기화 블럭 동작함...
        인스턴스 초기화 블럭 동작함...
        *
        *
        * */
    }

    public Product() {
        System.out.println("기본생성자 호출됨...");
    }

    public Product(String name, int price, String brand) {
        this.name = name;
        this.price = price;
        Product.brand = brand;
    }




    public String getInformation() {
        return "Product [name = "+this.name+", price = "+this.price+", brand ="
                +Product.brand+"]"; //brand is static field so instead of 'this.', have to use 'Classname.'
    }

}
