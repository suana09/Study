package q06to10;

import java.util.Scanner;

public class App02 {
    Scanner sin = new Scanner(System.in);

    public static void main(String[] args) {
        App02 app = new App02();
        app.pyr();


    }

    //삼각형
    public void tri() {
        System.out.print("줄 수를 입력하시오 : ");
        int num = sin.nextInt();
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //역삼각형
    public void inTri() {
        System.out.print("줄 수를 입력하시오 : ");
        int num = sin.nextInt();
        for (int i = num; i > 0; i--) {
            for (int j = num; j > 0; j--) {
                if (j > i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    //피라미드
    public void pyr() {
        System.out.print("줄 수를 입력하시오 : ");
        int num = sin.nextInt();
        System.out.println("(num+2)/2 = " + (num + 2) / 2);
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num + 2; j++) {
                int mid = (num + 2) / 2;
                if (j >= mid - i && j <= mid + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}
