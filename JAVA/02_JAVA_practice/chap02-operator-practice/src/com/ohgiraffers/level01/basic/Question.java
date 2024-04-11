package com.ohgiraffers.level01.basic;

public class Question {

    public static void main(String[] args) {

        /* 예제 문제를 기재해주세요 */

        /* Application01
        int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
		System.out.println(y >= 5 || x < 0 && x > 2);
		System.out.println(y += 10 - x++);
		System.out.println(x+=2);
		System.out.println( !('A' <= c && c <='Z') );
		System.out.println('C'-c);
		System.out.println('5'-'0');
		System.out.println(c+1);
		System.out.println(++c);
		System.out.println(c++);
		System.out.println(c);

		System.out.println() 의 결과를 예측하고 이유를 설명하시오.
		*/



		/*

		System.out.println(y >= 5 || x < 0 && x > 2);
        //true
		System.out.println(y += 10 - x++);
		//13, 5+10-2
		//x=3
		System.out.println(x+=2);
		//5, 3+2
		System.out.println( !('A' <= c && c <='Z') );
		//false, AND연산자의 양쪽항이 true > true > NOT 연산자이기때문에 반대인 false
		System.out.println('C'-c);
		//2, A가 65니까 C는 67이겠지뭐
		System.out.println('5'-'0');
		//5
		System.out.println(c+1);
		//66, 65+1
		System.out.println(++c);
		//B //char c +1를 하고 결과 B를 산출
		System.out.println(c++);
		//B //char c 를 먼저 출력하고 뒤에 +1
		System.out.println(c);
		//C

		*/



        /* Application02
         *
         * 내가 가지고 있는 사과의 갯수는 92개이다.
         * 이를 담을 수 있는 바구니에는 10개의 사과를 담을 수 있다면 총 10개의 바구니가 필요할 것이다.
         * 아래에 알맞은 코드를 넣으시오.
         *
         * int numOfApples = 92;
         * int sizeOfBucket = 10;
         * int numOfBucket = ?
         *
         * System.out.println("필요한 바구니의 수 : " + numOfBucket); -> 10
         */

        int numOfApples = 92;
        int sizeOfBucket = 10;
        int numOfBucket = ((numOfApples/sizeOfBucket)+1);

        System.out.println("필요한 바구니의 수 : "+numOfBucket);

		/**/

    }

}