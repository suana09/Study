package com.ohgiraffers.section01.users;

import java.lang.reflect.Member;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /*객체배열 (클래스 자료형 배열) 을 매개변수와 리턴값으로 사용할 수 있다.*/

        /*동일한 타입의 여러개의 인스턴스를 인자로 전달하거나 리턴받는 경우에도 객체 배열을 이용*/


        /*시스템 요구사항*/
        /*1. 여러명의 회원정보를 받아 한번에 여러 회원 정보를 등록*/
        /*2. 전체 회원 조회시 여러명의 회원정보 반환*/


        /*제약사항*/
        /*1. MemberRepository에서 static필드로 회원정보 관리*/
        /*2. 회원정보는 최대 10명까지 저장 가능*/

        Scanner sc = new Scanner(System.in);

        MemberService memberService = new MemberService();

        while (true) {
            System.out.println("===========회원관리 프로그램===========");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 전체 조회");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 선택 : ");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    memberService.signUpMember();
                    //회원등록
                    break;
                case 2:
                    memberService.showAllMember();
                    //회원전체조회
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다");
                    return;
                default:
                    System.out.println("잘못된 번호를 입력하였습니다. 다시 입력해주세요.");

            }

        }

        /**/
        /**/
        /**/


    }
}
