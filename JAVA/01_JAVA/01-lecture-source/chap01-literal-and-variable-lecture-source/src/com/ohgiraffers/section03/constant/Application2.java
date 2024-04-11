package com.ohgiraffers.section03.constant;

public class Application2 {
    public static void main (String[] args){

        /* 수업목표. 상수의 명명규칙에 대해 이해할 수 있다 */
        /* 상수의 명명규칙은 변수의 컴파일에러를 발생시키는 명명규칙과 같다*/
        /* 단, 개발자끼리의 암묵적인 규칙에서는 일부 차이를 보인다 */

        /* 1. 모든 문자는 영문자 대문자 혹은 대문자+숫자만 사용한다*/

            final int AGE1=20;
            final int AGE2=30;
            final int age3=40; //소문자로 사용은 가능하나 변수와 구분짓기 위하여 대문자 사용

        /* 2. 단어와 단어의 사이에는 언더스코어 (_) 를 사용한다 */

            final int MAX_AGE=60;
            final int MIN_AGE=20;
            final int minAge=30; //camel case의 사용도 가능하나 변수와 구분짓기 위함




    }
}
