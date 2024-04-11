package testProject;

import java.util.Scanner;

public class Menu {
    //메뉴
    /*
    메뉴고르기 ..
    1. 입력
    2. 조회
    3. 수정 및 삭제
    4. 프로그램 종료



    */
    public void mainMenu() {

        System.out.println("상품 목록 관리 프로그램입니다.");
        System.out.println("=============================");

        Scanner sin = new Scanner(System.in);
        boolean run = true;
        SubMenu subMenu = new SubMenu();


        mainMenu:

        while (run) {

            System.out.println("1. 상품 추가");
            System.out.println("2. 상품목록 조회");
            System.out.println("3. 상품목록 수정 및 삭제");
            System.out.println("4. 프로그램 종료");

            System.out.print("선택하실 메뉴를 번호로 입력해주세요 : ");
            int selectNum = sin.nextInt();

            switch (selectNum) {
                case 1 : 
                    subMenu.addMenu();
                    break;
                case 2: ;
                    subMenu.viewMenu();
                    break;
                case 3: ;
                    subMenu.setMenu();
                    break;
                case 4: ;
                    System.out.println("프로그램을 종료합니다.");
                    run = false;
                default :
                    System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
                    break;
            }

        }

    }





}
