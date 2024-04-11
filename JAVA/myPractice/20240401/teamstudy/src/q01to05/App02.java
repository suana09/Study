package q01to05;

import java.util.Scanner;

public class App02 {
    public static void main(String[] args) {

        App02 app = new App02();
        app.q02();

    }

    public void q02() {

        Scanner sin = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int i = sin.nextInt();

        if (i % 3 == 0) {
            System.out.println("입력하신 숫자는 3의 배수입니다");
        } else {
            System.out.println("입력하신 숫자는 3의 배수가 아닙니다");
        }
    }
}
