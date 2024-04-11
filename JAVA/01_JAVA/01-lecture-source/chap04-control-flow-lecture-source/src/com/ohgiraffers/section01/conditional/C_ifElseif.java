package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class C_ifElseif {
    public void testSimpleIfElseIfStatement(){

        /*수업목표 if-else-if문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다*/

        /*if-else-if문 표현식*/
        /*if (조건식1){
                        조건식 1이 true일때 코드;
        }
        elseif (조건식2){
                        조건식 2가 true일때 코드;
        }
        else {
                위의 조건이 모두 거짓일 경우 실행할 코드;
        }
        */

        System.out.println("옛날 옛적에 어느 마을에, 마음 착한 한 나무꾼이 살았습니다.");
        System.out.println("나무꾼은 비록 가난했지만 성실했기 때문에 매일 아침 일찍 나무를 하러 산을 올랐습니다.");
        System.out.println("그러던 어느날, 산에서 나무를 하던 나무꾼은 연못에 도끼를 빠뜨리고 말았습니다.");
        System.out.println("소중한 도끼를 잃어버려 곤란해하던 그 때, 연못에서 산신령이 나타났습니다.");
        System.out.println("산신령은 금도끼, 은도끼, 쇠도끼를 들고 나타나 물었습니다.");

        System.out.println("이 중 어느 도끼가 너의 도끼이냐?");
        System.out.println("1. 금도끼 2. 은도끼 3. 쇠도끼");

        Scanner sc = new Scanner(System.in);
        int axeAnswer = sc.nextInt();

        if (axeAnswer == 1){
            System.out.println("나무꾼은 제가 떨어트린 도끼가 금도끼라고 대답했습니다.");
            System.out.println("그러자 산신령이 \"욕심으로 거짓말을 하는구나!\" 하고 큰 소리로 화를 냈습니다.");
            System.out.println("산신령은 세 도끼를 모두 들고 뒤도 돌아보지 않고 떠나가 버렸습니다..");
        }
        else if (axeAnswer == 2) {
            System.out.println("나무꾼은 제가 떨어트린 도끼가 은도끼라고 대답했습니다.");
            System.out.println("그러자 산신령이 \"거짓말을 하는구나!\" 하고 얼굴을 찌푸렸습니다.");
            System.out.println("산신령은 세 도끼를 모두 들고 뒤도 돌아보지 않고 떠나가 버렸습니다..");
        }
        else {
            System.out.println("나무꾼은 제가 떨어트린 도끼가 쇠도끼라고 대답했습니다.");
            System.out.println("그러자 산신령이 \"아주 정직하구나!\" 하고 환하게 웃었습니다.");
            System.out.println("산신령은 \"정직한 대답을 했으니 이것들은 모두 네 것이다!\" 하고 도끼를 모두 주고 사라졌습니다.");
            System.out.println("나무꾼은 그렇게 금도끼, 은도끼, 쇠도끼를 모두 들고 돌아가 아주아주 행복하게 살았답니다.");


        }
        System.out.println("<금도끼 은도끼> 끝!");

    }

    public void testNestedIFElseIfStatement(){

        /*수업목표. 중첩된 if-else-if문의 흐름을 이해하고 적용할 수 있다*/
        /* 예제:
         *  ohgiraffers 대학의 김xx교수님은 학생들 시험 성적을 수기로 계산해서 학점 등급을 매기는 채점방식을 사용하고 있었다.
         *  90점 이상이면 'A', 80점 이상이면 'B', 70점 이상이면 'C', 60점 이상이면 'D'를
         *  60점 미만인 경우에는 'F'를 학점 등급으로하는 기준이다.
         *  추가로 각 등급의 중간점수(95, 85, 75..)인 경우 '+'를 붙여서 등급을 세분화 하다보니 신경쓸게 이만 저만이 아니다.
         *  그래서 학생의 이름과 점수를 입력하면 자동으로 학점 등급이 계산되는 프로그램을 만들기로 했다.
         * */


        // 95 : A+, 90~ : A, 85: B+, 80~ : B, 75: C+, 70~ : C, 65: C+, 60~ : D, ~60 : F

        Scanner sc = new Scanner(System.in);
        System.out.println("학생의 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("학생의 점수를 입력하세요 : ");
        int point = sc.nextInt();

        String grade;

        if (point>=90){

            if (point>=95){
                grade = "A+";
            }
            else {
                grade = "A";
            }
        }
        else if (point<90 && point >=80){
            if (point>=85){
                grade = "B+";
            }
            else {
                grade = "B";
            }
        }

        else if (point<80 && point>=70){
            if (point>=75){
                grade = "C+";
            }
            else {
                grade = "C";
            }
        }

        else if (point<70 && point>=60) {
            if (point>=65){
                grade = "D+";
            }
            else {
                grade = "D";
            }
        }
        else {
            grade = "F";
        }
        System.out.println( name + " 학생의 등급은 "+grade+" 등급 입니다.");


        }






}
