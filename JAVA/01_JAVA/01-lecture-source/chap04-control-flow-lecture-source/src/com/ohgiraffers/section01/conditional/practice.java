package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class practice {

    public void methodA(){

        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력해주세요 : ");
        String name = sc.nextLine();
        System.out.print("나이를 입력해주세요 : ");
        int age = sc.nextInt();

        String gen = null;

        if (age>=0) {
            if(age >= 0 && age < 8){
                gen = "영유아";
            }
            else if (age < 13){
                gen = "어린이";
            }
            else if (age < 20){
                gen = "청소년";
            }
            else if (age < 40){
                gen = "청년";
            }
            else if (age < 65){
                gen = "중장년";
            }
        }
        else { gen = "invalid input";
        }
        System.out.println(name+" 은(는) "+gen+" 입니다.");

    }

    public void methodS(){

        //어울리는 디즈니 공주 찾아주기 ^ ^
        //
        System.out.println("어서오세요 공주님 ~~ !!");
        System.out.println("공주님에게 어울리는 디즈니 프린세스를 찾아드립니다 . ^ ^ ");
        System.out.println("좋아하는 색을 골라주세요 ~ ~ ! ♡♡♡♡");
        System.out.println("1. 빨간색 2. 노란색 3. 흰색 4. 하늘색 5. 보라색");



        Scanner sc = new Scanner(System.in);
        int colour = sc.nextInt();

        switch (colour){
            case 1 :
                System.out.println("인어공주");
                break;
            case 2 :
                System.out.println("미녀와 야수 벨");
                break;
            case 3 :
                System.out.println("백설공주");
                break;
            case 4 :
                System.out.println("엘사");
                break;
            case 5 :
                System.out.println("라푼젤");
                break;
        }
    }
}
