package q01to05;

import java.util.Scanner;

public class App01 {

    public static void main(String[] args) {

        App01 app = new App01();
        app.q01();

    }

    public void q01() {
        Scanner sin = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int i = sin.nextInt();

        if (i >= 50) {
            System.out.println("입력하신 숫자는 50 이상입니다");
        } else {
            System.out.println("입력하신 숫자는 50 미만입니다");
        }
    }
}
