package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        /*수업목표. 배열의 사용방법을 익혀 배열을 사용할 수 있다*/

        /*배열의 사용방법*/
        /*1. 배열의 선언*/
        /*2. 배열의 할당*/
        /*3. 배열의 인덱스 공간에 값 대입*/

        /*1. 배열의 선언*/
        /*자료형[] 변수명;*/
        /*자료형 변수명[];*/

        /*선언은 stack에 배열의 주소를 보관할 수 있는 공간을 만드는 것*/
        int[] iarr;
        char carr[];

        /**/
        /*선언한 레퍼런스 변수에 배열을 할당하고 대입할 수 있다*/
        /*new 연산자는 heap영역에 공간을 할당하고 발생한 주소값을 반환하는 연산자이다.*/
        /*발생한 주소를 레퍼런스 변수 (참조형 변수) 에 저장하고 이것을 참조하고 사용하기 때문에 참조자료형이라고 한다.*/

        /*배열을 할당 시에는 반드시 배열이 크기를 지정해주어야 한다*/
        //iarr = new int[]; //크기를 지정해주지 않으면 에러발생
        iarr = new int[5];
        carr = new char[10];

        /*위의 선언과 할당을 동시에 할 수 있다*/
        int[] iarr2 = new int[10];
        char carr2[] = new char[5]; //이렇게도 가능

        /*heap메모리는 이름으로 접근하는 게 아니라 주소로 접근하는 영역이다*/
        /*stack에 저장된 주소로 heap에 할당된 배열을 찾아갈 수 있다.*/

        System.out.println("iarr2 = "+iarr2); //iarr2 = [I@41629346 //16진수 주소값
        System.out.println("carr2 = "+carr2); //16진수 주소값

        /*hashcode() : 일반적으로 객체의 주소값을 10진수로 변환하여 생성된 객체의 고유한 정수값을 반환*/
        /*동일객체인지를 비교하는 목적으로 쓰이며, 동등객체를 동일객체 취급하기 위해 '오버라이딩'* 해서 사용한다*/

        System.out.println("carr2.hashCode() = " + carr2.hashCode());
        System.out.println("iarr2.hashCode() = " + iarr2.hashCode());

        System.out.println("iarr2의 길이 : " + iarr2.length);
        System.out.println("carr2의 길이 : " + carr2.length);

        Scanner sc = new Scanner(System.in);
        System.out.print("새로 할당할 배열의 길이를 설정해주세요 : ");
        int size = sc.nextInt();

        double[] darr = new double[size];

        System.out.println("darr의 hashCode : "+darr.hashCode()); //51228289
        System.out.println("darr의 길이 : "+darr.length);

        darr = new double[30];

        System.out.println("변경 후 darr의 hashCode : "+darr.hashCode()); //455896770
        System.out.println("변경 후 darr의 길이 : "+darr.length);

        //원래 길이 15였던 darr의 hashCode와 new double[30]; 을 해주고 난 후의 darr의 hashCode는 다르다
        //같은 배열의 이름을 하고 있지만 [30] 의 길이를 가진 새로운 darr 로 덮어쓰기 한 것

        /*한 번 할당한 배열은 메모리에서 지우거나 변경할 수 없다.
        다만 null을 이용하여 해당 참조형 변수를 참조하지 못하게 할 수는 있다.*/
        /**/

        darr = null;

        System.out.println("darr.length = " + darr.length);

    }
}
