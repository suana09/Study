package com.ohgiraffers.section03.branching;

public class A_break {

    public void testSimpleBreakStatement(){

        /*수업목표. break문*/
        /*break문은 반복문 내에서 사용*/
        /*해당 반복문을 빠져나올때 사용, 반복문의 조건문 판단 결과와 상관없이 반복문을 빠져나올때 사용 */
        /*일반적으로 if(조건식){break;} 처럼 사용한다*/
        /*단, switch문은 반복문이 아니지만 예외적으로 사용*/

        /*break문을 이용하여 무한루프를 활용한 1~100까지의 합계구하기*/


        int sum = 0;
        int i = 1;
        while(true){
            sum += i;
            if (i==100){
                break;   //무조건 true라서 무한 반복하는 while문에 if(i==100) break; 를 걸어줌
            }
            i++;
        }

        System.out.println(sum);

        /**/
        /**/


    }

    public void testSimpleBreakStatement2(){
        /*수업목표. 중첩 반복문 내 break문 사용에 대한 흐름을 이해하고 적용할 수 있다*/
        /*break문은 모든 반복문을 종료하는 것 X, 자신에게 가장 인접한 반복문의 실행을 멈춤*/

        /*구구단 2~9단까지 출력*/
        /*단, 각 단의 수가 5보다 큰 경우 해당 반복문을 빠져나온다. (출력을 생략한다)*/

        for(int i=2;i<10;i++){
//            if (i>5){ break; }
            System.out.println("구구단 "+i+" 단을 출력합니다.");
            for (int j=1;j<10;j++){
                if (j>5){break;}
                System.out.println(i+" * "+j+" = "+(i*j));
            }
            System.out.println();
        }



    }



}
