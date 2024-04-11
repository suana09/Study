package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_while {

    /*수업목표 while문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다.*/

    /*[while 문 표현식]*/
    /*초기식;*/
    /*while(조건식){
                조건에 만족할 경우 수행할 코드 (반복할 코드);
                증감식;
    }
    */
    /*1부터 10까지 1씩 증가시키면서 10번 i값을 출력하는 기본 반복문*/

    public void testSimpleWhileStatement (){
        int i = 1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
    }

    public void testWhileExample(){

        /*입력한 문자열의 인덱스를 활용하여 문자 하나씩 출력해보기*/
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력하시오 : ");
        String str = sc.nextLine();

        //charAt():문자열에서 인덱스에 해당하는 문자를 char형으로 반환하기
        //length : String 클래스의 메소드로 문자열의 길이를 int형으로 반환해줌
        /*index 는 부터 시작하고 마지막 인덱스는 항상 길이보다 한 개 작은 숫자를 가진다.*/
/*
        System.out.println("========for 문========");
        for (int)*/




/*        System.out.println("=======for 문=======");
        for (int i = 0; i< str.length(); i++){
            char ch = str.charAt(i);
            System.out.println(i+"번째 글자는" + " : "+ch);

        }

        System.out.println("=======while 문=======");
        int index = 0;
        while(index < str.length()){
            char ch = str.charAt(index);
            System.out.println(index + " : "+ch);

        }*/

    }

    public void testWhileExample2(){
        /*중첩된 while 문의 흐름을 이해하고 적용할 수 있다*/
        /*while문으로 구구단 출력하기*/



    }

}
