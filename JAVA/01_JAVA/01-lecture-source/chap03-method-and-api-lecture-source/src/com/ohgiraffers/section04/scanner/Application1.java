package com.ohgiraffers.section04.scanner;
import java.lang.System;
import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        /*수업목표. java.util.scanner 을 이용하여 다양한 자료형 값 입력 받기*/

        /*1. Scanner 객체 선언*/
        /*1-1. 원래 이렇게 scanner 객체를 만들어야 함*/
        //java.util.Scanner sc = new java.util.Scanner(java.lang.System.in); //객체선언
        //java.util.Scanner sc = new java.util.Scanner(System.in);//java.lang.은생략도가능

        /*1-2. 다른 클래스에 클래스 사용 시 패키지명 생략하기 위해 import 구문 사용*/

        Scanner sc1 = new Scanner(System.in);

        /*2. 자료형 값 입력 받기*/
        /*2-1. 문자열 입력받기*/
        /*nextLine() : 입력받은 값을 문자열로 반환해줌*/

        System.out.print("이름을 입력해주세요 : ");
        String name = sc1.nextLine();
        System.out.println("입력하신 이름은 "+name+" 입니다.");

        /*2-2. 정수형 값 입력받기*/
        /*nextInt() : 입력받은 값을 int 형으로 반환해줌 */

        System.out.print("나이를 입력해주세요 : ");
        int age = sc1.nextInt();
        System.out.println("입력하신 나이는 "+age+"세 입니다.");

        /*2-3. 실수형 값 입력받기*/
        /*nextDouble() : 입력받은 값을 double 형으로 반환해줌 */

        System.out.print("공격력 배율을 입력해주세요 : ");
        double damagemult = sc1.nextDouble();
        System.out.println("공격력 배율은 "+damagemult+"배 입니다.");

        /*2-4. 논리형 값 입력받기*/
        /*nextBoolean()*/
        System.out.print("true or false?  : ");
        boolean torf = sc1.nextBoolean();
        System.out.println("its "+torf);

        /*2-5. 문자형 값 입력받기*/
        /*charAt(int index)를 사용한다*/
        sc1.nextLine();
        System.out.print("아무 문자나 입력해주세요 : ");
        char ch = sc1.nextLine().charAt(0);
        System.out.println("입력하신 문자는 "+ch);


    }
}
