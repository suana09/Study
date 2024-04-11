package com.ohgiraffers.section03.branching;

public class B_continue {

    public void testSimpleContinueStatement(){

        /*수업목표. continue문 사용에 대한 흐름을 이해하고 적용할 수 있다 */

        /*continue문은 반복문 내에서 사용한다*/
        /*해당 반복문의 반복 회차를 중간에 멈추고 다시 증감식으로 넘어가게 해준다*/
        /*일반적으로 if(조건식){continue;} 의 형태로 사용한다*/
        /*보통 반복문 내에서 특정 조건에 대한 예외를 처리하고자 할 때 자주 사용한다.*/
        /**/


        for (int i=1; i<=10;i++){
            if (i%2 == 0){
                continue; //i가 짝수면 i 출력을 스킵
            }
            System.out.println(i);
        }

    }

    public void testSimpleContinueStatement2(){

        /*수업목표. continue문 사용에 대한 흐름을 이해하고 적용할 수 있다 */

        /*continue문은 반복문 내에서 사용한다*/
        /*해당 반복문의 반복 회차를 중간에 멈추고 다시 증감식으로 넘어가게 해준다*/
        /*일반적으로 if(조건식){continue;} 의 형태로 사용한다*/
        /*보통 반복문 내에서 특정 조건에 대한 예외를 처리하고자 할 때 자주 사용한다.*/
        /**/

        for(int dan = 2; dan < 10; dan++){

            /* 설명. 여기까지 빠져나옴 */
            for(int su = 1; su < 10; su++){
                if(su % 2 == 0){

                    /*  su가 짝수인 경우 해당 회차 반복 내용을 건너 뛰고 증감식으로 이동 */
                    continue;
                }
                System.out.println(dan + " * " + su + " = " + dan * su);
            }
            System.out.println();
        }

    }


}
