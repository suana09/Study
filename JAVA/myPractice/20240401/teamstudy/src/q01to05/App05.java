package q01to05;

public class App05 {
    public static void main(String[] args) {

        App05 app = new App05();
        app.for5();
        app.while5();


    }

    public void for5() {
        System.out.println("for문 구구단 출력");

        for (int i = 2; i <= 9; i++) {
            System.out.println("구구단 " + i + "단");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
            System.out.println();
        }
    }

    public void while5() {
        System.out.println("while문 구구단 출력");

        int i = 2;
        while (i <= 9) {
            System.out.println("구구단 " + i + "단");
            int j = 1;
            while (j <= 9) {
                System.out.println(i + " * " + j + " = " + i * j);
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
