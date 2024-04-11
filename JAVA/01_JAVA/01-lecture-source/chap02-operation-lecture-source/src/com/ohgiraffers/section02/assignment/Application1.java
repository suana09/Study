package com.ohgiraffers.section02.assignment;

public class Application1 {
    public static void main (String[] args){

        /*수업목표. 대입연산자와 산술복합 대입연산자를 이해하고 활용할 수 있다*/

        /*대입연산자와 산술복합 대입연산자*/
        /* '=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 대입 */
        /* '+=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 더한 결과를 왼쪽에 대입 */
        /* '-=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 뺀 결과를 왼쪽의 피연산자에 대입 */
        /* '*=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 곱한 결과를 왼쪽의 피연산자에 대입 */
        /* '/=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 나눈 결과를 왼쪽의 피연산자에 대입 */
        /* '%=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 나누고 나머지값을 왼쪽의 피연산자에 대입 */
        /**/

        int num = 12;

        System.out.println("num : " + num);

        // 3 증가시

        num = num + 3; //대입연산자의 오른쪽은 값, 왼쪽은 데이터가 들어갈 의미

        System.out.println("num : " + num);

        num += 3; // num = num + 3; 과 같은 의미

        System.out.println("num : " + num);

        num -= 5; // num = num - 5;

        System.out.println("num : " + num);

        num *= 2; // num = num * 2;
        System.out.println("num : " + num);

        num /= 2; // num / num / 2;
        System.out.println("num : " + num);

        num %= 3; // num / num % 3 ;
        System.out.println("num : " + num);
        //홀수짝수 나눌때 많이씀

        /*주의사항*/
        /*산술복합 대입연산자의 작성 순서에 주의하여야 한다.*/


    }
}
