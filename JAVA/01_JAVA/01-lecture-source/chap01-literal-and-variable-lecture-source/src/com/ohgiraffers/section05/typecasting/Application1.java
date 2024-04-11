package com.ohgiraffers.section05.typecasting;

public class Application1 {

    public static void main (String[] args){

        /* 자동형변환 규칙을 이해할 수 있다*/

        /* 자바에서 다른 자료형끼리의 연산은 피연사자들이 모두 같은 자료형일 경우 실행할 수 있다.*/
        /* 즉, 같은 자료형끼리만 연산을 수행할 수 있다. */

        /* 형변환의 종류와 규칙 */
        /* 1. 자동형변환 (묵시적 형변환) : 내가 지시하지 않아도 컴파일러가 자동으로 수행해주는 형변환*/
        /* 1-1. 작은 자료형이 큰 자료형으로 자동형변환 된다*/
        /* 1-2. 정수는 실수로 자동형변환*/
        /* 1-3. 문자형은 int 형으로 자동형변환이 된다*/
        /* 1-4. 논리형은 형변환 규칙에서 제외된다*/

        /* 2. 강제형변환 (명시적 형변환) : 형변환(cast) 연산자를 이용해 강제적으로 수행하는 형변환*/
        /* 필연적으로 데이터 손질이 발생 , 강제적으로 데이터를 손실시킬 때? */
        /* 2-1. 자동형변환이 적용되지 않는 경우 강제형변환이 필요*/


        /* 자동형변환 규칙 테스트*/

        /* 1-1. 작은 자료형이 큰 자료형으로 자동형변환 된다*/
        /* 1-1-1. 정수끼리의 자동형변환*/

        byte bnum = 1;
        short snum = bnum;
        int inum = snum;
        long lnum = inum;

        int num1 = 10;
        long num2 = 20L;

        //int result = num1 + num2; //자동으로 큰 자료형인 long type으로 변경 후에 계산하기 때문에 int형 변수에 값을 담을 수 없다
        long result = num1 + num2; //오류X, 데이터 손실이 발생하지 않는 int>long 변환 후 연산

        System.out.println(result);

        /* 1-1-2 실수끼리의 자동형변환*/

        float fnum = 4.0f;
        double dnum = fnum;

        double result2 = fnum+dnum;

        System.out.println(result2);


        /* 1-2. 정수는 실수로 자동형변환*/
        /* 정수를 실수로 변환할 때 소수점 자리수가 없어도 실수형태로 표현이 가능. 이 경우 데이터 손실이 없기 때문에 자동으로 변환 ok*/

        /* 그럼 long을 float로 변환은 안되지 않나 */



        /* 1-3. 문자형은 int 형으로 자동형변환이 된다*/
        char ch1 = 'a';
        int num11 = ch1;

        char ch2 = '곰';
        int num0019 = ch2;
        System.out.println(num0019);

        /* 1-4. 논리형은 형변환 규칙에서 제외된다*/

        boolean isTrue = true;

        //byte bnum00 = isTrue; //boolean cannot be converted to byte

        /**/
        /**/


    }
}
