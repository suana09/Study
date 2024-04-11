package q01to05;

import java.util.Scanner;

public class App03 {
    public static void main(String[] args) {
        App03 app3 = new App03();
        app3.q03();

    }

    public void q03() {
        Scanner sin = new Scanner(System.in);
        System.out.print("학년을 입력하세요 : ");
        int grade = sin.nextInt();
        System.out.print("점수를 입력하세요 : ");
        int point = sin.nextInt();
        boolean isPassed = false;
        boolean isValid = false;

        if (grade == 4) {
            if (point >= 70 && point <= 100) {
                isPassed = true;
                isValid = true;
            } else if (point < 0 || point > 100) {
            } else {
                isValid = true;
            }
        } else if (grade >= 1 && grade < 4) {
            if (point >= 60 && point <= 100) {
                isPassed = true;
                isValid = true;
            } else if (point < 0 || point > 100) {
            } else {
                isValid = true;
            }
        } else {
        }

        if (isPassed && isValid) {
            System.out.println("합격하셨습니다.");
        } else if (isPassed == false && isValid) {
            System.out.println("불합격하셨습니다.");
        } else {
            System.out.println("입력하신 학년과 점수가 맞는지 다시 확인해주세요.");
        }

    }
}
