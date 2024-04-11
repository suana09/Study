package com.ohgiraffers.section01.array;

public class Application3 {

    public static void main(String[] args) {

        /*배열이 초기화되는 자료형별 기본값을 이해할 수 있다*/

        /*값의 형태별 기본값*/
        /*정수 : 0*/
        /*실수: 0.0*/
        /*논리: false*/
        /*문자: \u0000*/
        /*참조: null*/

        int[] iarr = new int[5];

        for(int i = 0;i<iarr.length;i++){
            System.out.println("iarr[ "+i+" ]의 값 : "+iarr[i]);
        }


        double[] darr = new double[3];
        for(int i = 0;i<darr.length;i++){
            System.out.println("darr[ "+i+" ]의 값 : "+darr[i]);
        }

        boolean[] barr = new boolean[3];
        for(int i = 0;i<barr.length;i++){
            System.out.println("barr[ "+i+" ]의 값 : "+barr[i]);
        }

        char[] carr = new char[3];
        for(int i = 0;i<carr.length;i++){
            System.out.println("carr[ "+i+" ]의 값 : "+carr[i]);
        }

        /*자바에서 지정한 기본값 외의 값을 초기화 하고 싶은 경우 블럭을 이용한다.*/
        /*블럭을 이용하는 경우는 new를 사용하지 않아도 되며 값의 갯수만큼 자동으로 크기가 설정된다.*/

        int[] iarr2 = {10, 20, 30, 40, 50};
        System.out.println("iarr2.length : "+iarr2.length);

        for(int i = 0;i<iarr2.length;i++){
            System.out.println("iarr2[ "+i+" ]의 값 : "+iarr2[i]);
        }

        int[] iarr3 = new int[] {10, 20, 30, 40, 50};
        System.out.println("iarr3.length : "+iarr3.length); //new 연산자를 사용해서도 가능

        String[] sarr = {"apple", "banana", "grape", "orange", "peach"};
        for(int i = 0;i<sarr.length;i++){
            System.out.println("sarr[ "+i+" ]의 값 : "+sarr[i]);
        }






        /**/
        /**/




    }


}
