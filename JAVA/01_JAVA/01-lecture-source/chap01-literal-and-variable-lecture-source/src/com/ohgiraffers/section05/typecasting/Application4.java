package com.ohgiraffers.section05.typecasting;

public class Application4 {
    public static void main (String[] args){

        /*형변환시 주의할 점을 이해하고 사용할 수 있다.*/

        /*형변환시 주의점 : 데이터 손실에 유의해서 사용!*/

        /* 1. 의도하지 않은 데이터 손실*/
        int inum = 290;
        byte bnum = (byte)inum;

        System.out.println("inum : " + inum);
        System.out.println("bnum : " + bnum);
        //비트 앞부분 손실로 데이터가 어디서 얼마나 알 수 없기 때문에 결과값 예측이 어려움


        /* 2. 의도한 데이터 손실*/
        double height = 175.5;
        int floorHeight = (int)height;
        System.out.println(floorHeight);

        //의도적으로 소수점 아래 자리를 날림!

        char ch1 = '곰';
        byte bnum1 = (byte)ch1;

        System.out.println(bnum1);

    }
}
