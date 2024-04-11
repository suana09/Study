package q06to10;

public class App01 {
    public static void main(String[] args) {
        App01 app = new App01();
        app.q06();
    }

    public void q06() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0 || i % 5 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
