package q01to05;

import java.util.Scanner;

public class App04 {

    public static void main(String[] args) {

        App04 app = new App04();
        app.q04();

    }


    public void q04() {
        Scanner sin = new Scanner(System.in);
        System.out.println("3개의 정수를 입력해주세요.");
        System.out.print("1: ");
        int i1 = sin.nextInt();
        System.out.print("2: ");
        int i2 = sin.nextInt();
        System.out.print("3: ");
        int i3 = sin.nextInt();

        int min, max, sum;
        double avg;

        if (i1 >= i2 && i1 >= i3) {
            max = i1;
        } else if (i2 >= i1 && i2 >= i3) {
            max = i2;
        } else {
            max = i3;
        }

        if (i1 <= i2 && i1 <= i3) {
            min = i1;
        } else if (i2 <= i1 && i2 <= i3) {
            min = i2;
        } else {
            min = i3;
        }

        sum = i1 + i2 + i3;
        avg = sum / 3;

        System.out.println("최솟값 = " + min);
        System.out.println("최댓값 = " + max);
        System.out.println("합계 = " + sum);
        System.out.println("평균 = " + avg);

    }

    ;
}
