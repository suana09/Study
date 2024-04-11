package com.ohgiraffers.section05.typecasting;

public class Application2 {

    public static void main (String[] args){

        /*수업목표. 강제 형변환 규칙에 대해 이해할 수 있다*/

        /*강제형변환*/
        /*바꾸려는 자료형으로 캐스트 연산자를 이용하여 형변환한다*/
        /* ex) (바꿀 자료형) 값;*/


        /* 자동형변환 규칙의 반대 상황에서 강제형변환이 필요하다. */
        /* 1. 강제형변환 규칙*/
        /* 1-1 큰 자료형에서 작은 자료형으로 변경시 강제형변환이 필요*/
        /* 1-1-1 정수끼리의 강제형변환*/
        long lnum = 8L;
        //int inum = lnum; //possible lossy conversion from long to int
        //데이터 손실 가능성을 컴파일러가 알려줌!! 이녀석 똑똑하군

        int inum = (int)lnum; //변경하려는 자료형을 명시하여 강제형변환

        short snum = (short)inum;

        /* 1-1-2 실수끼리의 강제형변환*/

        double dnum = 8.0;
        float fnum = (float) dnum;


        /* 1-2 실수를 정수로 변경시 강제형변환이 필요*/

        float fnum1 = 4.0f;
        //long lnum2 = fnum1;
        //float (4byte) long (8byte)로 long이 더 큰 자료형임에도 불구하고
        //소수점 자리 이하의 데이터 손실 가능성으로 자동형변환이 되지 않음
        long lnum2 = (long)fnum1;

        //강제형변환의 의미는 '내가 데이터 손실을 감안할테니 형변환을 하겠다!' 는 의미


        /* 1-3 문자형을 int 미만 크기의 변수에 저장할 때 강제형변환이 필요*/

        // char의 bit값이 int 이상부터 가능해서 ?

        char ch1 = 'a';
        byte bbbb = (byte)ch1;

        int num1 = 97;
        int num2 = -97;

        char ch2 = (char)num1;
        char ch3 = (char)num2;

        System.out.println("ch2 : "+ch2);
        System.out.println("ch3 : "+ch3);


        /* 1-4 논리형은 강제형변환 규칙에서도 제외 (강제형변환 불가)*/

        boolean isTrue = true ;
        // byte b = (byte)isTrue; //boolean cannot be converted to byte




        /**/

    }
}
