package com.ohgiraffers.section05.typecasting;

public class pratice {
    public static void main (String[] args){

        /*강제형변환*/

        /*1. 정수>정수*/
        /*byte, short, int, long*/

        long lnum = 8;

        int inum = (int)lnum;
        short snum = (short)inum;
        byte bnum = (byte)snum;


        /*2. 실수>실수*/

        double dnum = 1.0;
        float fnum = (float)dnum;

        /*3. 실수>정수*/

        float flnum = 1.0f;
        int inum1 = (int)flnum;


        System.out.println(inum1);

        /*4. 문자>int미만*/

        char ch1 = '곰';
        short snum1 = (short)ch1;

        System.out.println(snum1);

    }
}
