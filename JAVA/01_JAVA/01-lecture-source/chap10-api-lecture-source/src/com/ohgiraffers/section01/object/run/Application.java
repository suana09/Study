package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.book.Book;

import java.util.HashMap;
import java.util.Map;

public class Application extends Object {
    public static void main(String[] args) {

        /*Object 클래스의 toString에 대해 */

        /*모든 클래스는 Object 클래스의 후손이다*/
        /*따라서 Object 클래스가 가진 메소드를 자신의 것처럼 사용할 수 있다.*/
        /*또한, 부모 클래스가 가지는 메소드를 오버라이딩하여 사용하는 것도 가능하다.*/


        /*Object 클래스의 메소드 중 관례상 많이 오버라이딩하여 사용하는 메소드들이 있다.*/
        /*toString(), equals(), hashCode()*/

        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(2, "목민심서", "정약용", 1600000);
        Book book3 = new Book(3, "훈민정음", "세종대왕", 1500000000);

        System.out.println("book1.toString() = " + book1.toString());
        System.out.println("book2.toString() = " + book2.toString());
        System.out.println("book3.toString() = " + book3.toString());

        System.out.println("book1 = " + book1);
        System.out.println("book2 = " + book2);
        System.out.println("book3 = " + book3);
        //toString()을 사용하지 않고 인스턴스의 레퍼런스 변수만 호출하여 출력해도 자동으로 toString과 같은 결과가 출력됨

        Map<Book, String> map = new HashMap<>();
        map.put((new Book(1, "홍길동전","허균",50000)),"Best");

        String str = map.get((new Book(1, "홍길동전","허균",50000)));

        System.out.println(str);

        String str1 = new String();
        String str2 = new String();

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

    }

}
