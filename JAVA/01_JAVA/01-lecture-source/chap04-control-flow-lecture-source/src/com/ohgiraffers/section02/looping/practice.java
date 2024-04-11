package com.ohgiraffers.section02.looping;

import javax.swing.*;
import java.util.Scanner;

public class practice {

    public void elephantsong(){

        //n마리코끼리가 거미줄에걸렷네 신 나게 그네를 탓 ! 다 ! 네 ~~
        //너무너무 재밌어 좋아좋아 랄랄라 다른친구코끼리도 불 렀 네 ..
        //노래 가사를 for 문을 이용하여 만들어보기

        for (int i=1;i<=10;i++){
            System.out.println(i+"마리 코끼리가 거미줄에 걸렸네 신나게 그네를 탔다네~");
            System.out.println("너무너무 재밌어 좋아좋아 랄랄라");
            System.out.println("다른 친구 코끼리도 불 렀 네");
        }
    }

    public void methodName() {


        int dn;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("1~10까지의 숫자를 입력하시오 ..");
            dn = sc.nextInt();
        } while (dn != 4);

        System.out.println("당신은 죽었습니다 ...");


    }

    //별찍기 for
    public void starsFor(){
        Scanner sc = new Scanner(System.in);
        System.out.print("줄 수 : ");
        int row = sc.nextInt();

        for(int i=1;i<=row;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    //별찍기 while
    public void starsWhile(){
        Scanner sc = new Scanner(System.in);
        System.out.print("줄 수 : ");
        int row = sc.nextInt();

        int i = 1;
        while (i<=row){
            int j = 1;
            while (j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

    }

    public void doWhile(){
        Scanner sc = new Scanner(System.in);
        System.out.print("사용하실 이름을 입력해주세요 : ");
        String str = sc.next();
        sc.nextLine();

        do {
            System.out.println("입력하신 이름은 "+str+" 입니다. 다시 입력하시겠습니까?");
            System.out.println("재입력을 원하신다면 사용하실 이름을,");
            System.out.println("재입력을 원치 않으신다면 \"종료\" 를 입력해주세요.");
            str = sc.nextLine();

        }while(!str.equals("종료"));

    }

    public void Gugudan(){

        for(int )
    }
}


