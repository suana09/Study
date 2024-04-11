package com.ohgiraffers.section02.variable;

public class Application2 {
    public static void main (String[] args) {

        /* 수업목표. 변수를 선언하고 값을 할당하여 사용할 수 있다 */
        /* 변수를 사용하는 방법 */
        /* 1. 변수를 준비한다 (선언)*/
        /* 2. 변수의 값을 대입한다 (값 대입 및 초기화) */
        /* 3. 변수를 사용한다 */

        /* 자료형이란?
        * 다양한 값의 형태별로 어느 정도의 크기를 하나의 값으로 취급할 것인지 미리 컴파일러와 약속한다
        * ex) 앞에서 아용한 int 자료형은 정수를 4byte만큼 읽어서 하나의 값으로 취급하겠다는 약속이다.
        *   이러한 자료형은 기본자료형 (primary type) 과 참조자료형 (reference type) 으로 나뉘어진다.
        *   그 중 기본자료형 8가지부터 살펴보기로 한다.
        * */


        /* 목차 1-1-1 숫자를 취급하는 자료형 */
        /* 정수를 취급하는 자료형에는 4가지가 있다. */


        byte bnum; //1byte
        short snum; //2byte
        int inum; //4byte
        long lnum; //8byte

        /* 실수를 취급하는 자료형은 2가지가 있다. */

        float fnum; //4byte
        double dnum; //8byte

        /* 목차 1-1-2. 문자를 취급하는 자료형
        * 문자를 취급하는 자료형은 한 가지가 있다.*/

        char ch; //2byte
        char ch2;

        char gender;
        gender = '여';


        /* 1-1-3. 논리값을 취급하는 자료형 */
        boolean isTrue; //1byte

        /* 이상 8가지를 기본 자료형이라고 한다 */


        /* 1-1-4 문자열을 취급하는 자료형 */

        String str; // 4byte (엄밀히 이야기하면 주소값은 4byte 정수값)


        /* 2. 변수의 값을 대입한다. (값 대입 및 초기화) */

        /* 2-1. 정수를 취급하는 자료형에 값 대입 */

        bnum = 1; // byte, -128~+127
        snum = 2; // short, -32768 ~ 32767
        inum = 3; // int, 아무튼개많은숫자
        //lnum = 8; // 아무 문제 없을 거 같지만 뒤에 대문자 L을 붙여야 한다. 그 이유는 형변환에서.. 투비컨티뉴드
        lnum = 8L; // long, 아무튼진짜진짜개많은숫자

        /* 2-2. 실수를 취급하는 자료형에 값 대입 */

        //fnum = 4.0;
        fnum = 4.0f; //float
        dnum = 8.0; dnum = 8.0d; //double, d를 붙여도 ok 안 붙여도 ok

        /* 2-3. 문자를 취급하는 자료형에 값 대입 */

        ch = 'a'; //문자 형태의 값을 저장할 수 있다
        ch2 = 97; // 'a'의 아스키코드는 97. 문자 자료형으로 선언된 ch2에 97을 저장할 수 있다. (형태는 당연히 문자 'a')

        /* 2-4. 논리를 취급하는 자료형에 값 대입 */

        isTrue = true;
        isTrue = false;

        /* 2-5. 문자열을 취급하는 자료형에 값 대입 */

        str = "안냐세여";

        /* 독특한 형태가 아닌, 일반적인 형태로 사용할 수 있는 자료형을 대표자료형이라고 한다.*/
        /* 정수의 경우 int, 실수는 double 이 대표자료형이다. */


        /* 3. 변수를 사용한다 */
        /* 변수에 저장한 값을 출력*/
        System.out.println("========= 변수에 저장된 값을 출력 =========");
        System.out.println("bnum의 값 출력 : " + bnum);
        System.out.println("snum의 값 출력 : " + snum);
        System.out.println("inum의 값 출력 : " + inum);
        System.out.println("lnum의 값 출력 : " + lnum);


        System.out.println("fnum의 값 출력 : " + fnum);
        System.out.println("dnum의 값 출력 : " + dnum);

        System.out.println("ch의 값 출력 : " + ch);
        System.out.println("ch2의 값 출력 : " + ch2);

        System.out.println("isTrue의 값 출력 : " + isTrue);

        System.out.println("str의 값 출력 : " + str);











    }
}
