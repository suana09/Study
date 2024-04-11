package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.book.Book;

public class Application2 {

    public static void main(String[] args) {

        /*Object 클래스의 equals() 메소드의 오버라이딩 목적을 이해하고 활용할 수 있다.*/

        /*equals() 메소드의 오버라이딩*/
        /*equals 메소드는 매개변수로 전달받은 인스턴스와 == 연산을 하여 true of false*/
        /*동일한 인스턴스인지 비교하는 기능을 한다.*/

        /*동일객체와 동등객체*/
        /*동일객체: 주소가 동일한 인스턴스*/
        /*동등객체: 주소는 다르더라도 필드값이 동일한 인스턴스*/

        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(1, "홍길동전", "허균", 50000);

        System.out.println("두 인스턴스의 == 연산비교 : "+(book1 == book2));
        System.out.println("두 인스턴스의 equals() 비교 : "+(book1.equals(book2)));

        /**/
        /**/

    }
}
