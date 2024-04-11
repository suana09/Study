package com.ohgiraffers.section01.literal;

public class Application1 {

    public static void main (String[] args) {
        /*주석은 단축키 없나?? 있을거같은데*/
        /* ctrl+shift / */
        /* 수업목표! 여러 가지의 값의 형태를 출력할 수 있다 */

        /* 1. 숫자 형태의 값
         * 1-1. 정수 형태의 값
         * 1-2. 실수 형태의 값
         */



        System.out.println(1234); //123 정수
        System.out.println(1.8); //1.8 실수

        /*2. 문자 형태의 값 출력*/

        System.out.println('a'); //single character, with single quotation mark
        //System.out.println('ab'); //Too many characters, 두 개 이상은 문자로 취급 X
        //System.out.println(''); //empty character literal
        System.out.println('1'); //숫자값이지만 홀따옴표로 감싸져 있는 경우 문자 '1' 로 판단
        System.out.println('강'); //숫자값이지만 홀따옴표로 감싸져 있는 경우 문자 '1' 로 판단

        /*3. 문자열 형태의 값 출력*/
        System.out.println("complex letters"); //with double quotation marks
        System.out.println("123"); //정수이지만 ""로 감싸져 있어서 문자열의 형태
        System.out.println(""); //아무것도 없는 빈 ""도 문자열로 취급한다
        System.out.println("a"); //1개의 문자도 ""로 감싸면 문자열

        System.out.println("문자열은 \"\"안에 넣으면 된다!");

        /*4. 논리 형태의 값 출력*/
        System.out.println(true); //뱀은 파충류인가요? 참
        System.out.println(false); //뱀은 식물인가요? 거짓

        //true or false 를 논리형이라고 한다

    }

}
