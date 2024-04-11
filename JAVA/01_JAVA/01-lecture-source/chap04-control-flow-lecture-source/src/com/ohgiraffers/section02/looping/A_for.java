package com.ohgiraffers.section02.looping;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class A_for {

    public void testSimpleForStatement() {

        /*수업목표. for 단독 사용에 대한 흐름 이해하고 적용하기*/

        /*[for문 표현식]*/
        /*for(초기식; 조건식; 증감식){
                                조건을 만족하는 경우 수행할 구문(반복할 구문);
        }*/
        /**/

        /*1부터 10까지 1씩 증가시키며 10번 i값을 증가시키는 기본 반복문*/
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

        }

        int j = 1;
        for (; j <= 15; j++) {

            System.out.println(j); //변수를 밖으로 빼도 ok
        }

        int h = 1;
        for (; h <= 10; ) {
            System.out.println(h);
            h++; //증감식을 반복할 구문에 써도 ok
        }

        //but 조건식은 빼면 안 됨!!
    }

        public void testForExample1(){

            /*우리가 뭘 반복하는지 확인하여 반복문으로 개선할 수 있다.*/
            /*10명의 학생의 이름을 입력받아 이름을 출력해보자*/

            Scanner sc = new Scanner(System.in);
            //System.out.print("10번 학생의 이름을 입력해주세요 : ");
            //String stu = sc.nextLine();
            //System.out.println("1번 학생의 이름은 "+stu10+" 입니다.");
            //System.out.println("10명의 학생 이름을 입력 받고 출력하는 기능을 완료하였습니다!");

            /*반복해야 하는 내용은?*/

            /*1. 학생의 이름을 입력받아 변수에 저장*/
            /*2. 안내문구 출력*/
            /*3. 저장된 이름 출력*/

            /*반복 횟수 1~10까지 1씩 증가하여 총 10번을 반복하였다.*/

            for(int i = 1;i<=10; i++){
                System.out.print(i + "번 학생의 이름을 입력해주세요");
                String stu1 = sc.nextLine();
                System.out.println(i+" 번 학생의 이름은 "+stu1+" 입니다.");

            }

        }


        public void testForExample2(){
            /*우리가 뭘 반복하는지 확인하여 반복문으로 개선할 수 있다. (2)*/
            /*문장 속의 규칙 찾기*/
            /*1~10까지의 합계를 구하라*/
            /**/


            int num1 = 1;
            int num2 = 2;
            int num3 = 3;
            int num4 = 4;
            int num5 = 5;
            int num6 = 6;
            int num7 = 7;
            int num8 = 8;
            int num9 = 9;
            int num10 = 10;

            int sum = 0;

            sum += num1;
            sum += num2;
            sum += num3;
            sum += num4;
            sum += num5;
            sum += num6;
            sum += num7;
            sum += num8;
            sum += num9;
            sum += num10;

            System.out.println("sum = " + sum);

            int sum2 = 0;  //sum2 변수를 0으로 초기화

            for(int i=1;i<=10;i++){
                sum2 += i;
            }
            System.out.println("sum2 : "+sum2);

        }

        public void testForExample3(){

            int random = (int) (Math.random() * 6) + 5;

            System.out.println("random : " + random);

            /* 뭔가 더해서 담기 위해 sum 변수를 0으로 초기화 */
            int sum = 0;


            if(random == 5) {
                sum += 1;
                sum += 2;
                sum += 3;
                sum += 4;
                sum += 5;
            } else if(random == 6) {
                sum += 1;
                sum += 2;
                sum += 3;
                sum += 4;
                sum += 5;
                sum += 6;
            } else if(random == 7) {
                sum += 1;
                sum += 2;
                sum += 3;
                sum += 4;
                sum += 5;
                sum += 6;
                sum += 7;
            } else if(random == 8) {
                sum += 1;
                sum += 2;
                sum += 3;
                sum += 4;
                sum += 5;
                sum += 6;
                sum += 7;
                sum += 8;
            } else if(random == 9) {
                sum += 1;
                sum += 2;
                sum += 3;
                sum += 4;
                sum += 5;
                sum += 6;
                sum += 7;
                sum += 8;
                sum += 9;
            } else {
                sum += 1;
                sum += 2;
                sum += 3;
                sum += 4;
                sum += 5;
                sum += 6;
                sum += 7;
                sum += 8;
                sum += 9;
                sum += 10;
            }

            System.out.println("1부터 " + random + "까지의 합은 : " + sum);

            /* 반복문을 이용한 개선*/

            int sum3 = 0;
            for (int i=1;i<=random;i++){
                sum3 += i;
            }
            System.out.println("1부터 "+random+"까지의 합은 : "+sum3);
        }

        public void printSimpleGugudan(){

            /*수업목표. 무엇을 반복하는지 확인하여 반복문으로 개선할 수 있다*/

            /**/
            /*키보드로 2~9 사이의 숫자를 입력받아*/
            /*2~9 사이의 경우 해단 란의 구구단을 출력하고*/
            /*그렇지 않은 경우 "반드시 2~9 사이의 양수를 입력해야 합니다." 라는 메세지 출력*/
            /**/

            Scanner sc = new Scanner(System.in);
            System.out.print("출력할 구구단의 단 수를 입력하세요 : ");
            int dan = sc.nextInt();

            if(dan>=2 && dan<=9){
                for(int su = 1; su<=9; su++){
                    System.out.println(dan+" * "+ su + " = " + (dan*su));
                }

            }

            else {
                System.out.println("[error!] 반드시 2~9 사이의 양수를 입력해야 합니다.");
            }

            System.out.println("프로그램을 종료합니다.");


        }



}
