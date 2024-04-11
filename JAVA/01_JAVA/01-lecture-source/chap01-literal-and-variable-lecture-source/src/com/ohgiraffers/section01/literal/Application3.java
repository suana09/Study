package com.ohgiraffers.section01.literal;

public class Application3 {

    public static void main (String[] argv) {

        /* 수업목표 : 문자열 합치기 결과를 예측하고 사용할 수 있다 */
        /* 목차 1. 두 개의 문자열 합치기 */

        System.out.println("============ 두 개의 문자열 합치기 ============");
        System.out.println(9 + 9); //18
        System.out.println("9" + "9"); //99
        System.out.println("9"+9);//99
        System.out.println(9+"9");//99

        /* 목차 2. 세 개의 문자열 합치기 */
        System.out.println("============ 세 개의 문자열 합치기 ============");
        System.out.println("곰도리"+" 궁댕이는"+" 뚱쭝해");
        System.out.println("후이바오는"+" 지금 "+0.8+"세 아기판다예요");
        System.out.println("9"+9+9);
        System.out.println(9+"9"+9); // 왼쪽의 연산부터 수행한 후 그 결과를 오른쪽과 연산함 (9+"9" = 문자열 "99" = 9 = "999"
        System.out.println(9+9+"9");
        System.out.println("9"+(9+9));


        /* 목차 3. 문자열 합치기의 응용*/
        /* 10과 20의 사칙연산 결과를 출력하세요 */
        System.out.println("============ 10과 20의 사칙연산 결과 ============");
        System.out.println(10+20);
        System.out.println(10-20);
        System.out.println(10*20);
        System.out.println(10/20);
        System.out.println(10%20);


        System.out.println("============ 10과 20의 사칙연산 결과를 보기 좋게 출력하기 ============");
        System.out.println("10+20 = " + (10+20));
        System.out.println("10-20 = " + (10-20));
        System.out.println("10*20 = " + (10*20));
        System.out.println("10/20 = " + (10/20));
        System.out.println("10%20 = " + (10%20));


        System.out.println("기차");
        System.out.println("기차"+"칙칙폭폭");
        System.out.println("기차"+123+45+"칙칙폭폭");
        System.out.println(123+45+"기차"+"출발");


    }
}
