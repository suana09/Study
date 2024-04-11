package q06to10;

public class App04 {

    public static void main(String[] args) {
        App04 app = new App04();
        app.q09dice();
    }

    public void q09dice() {

        while (true) {
            int i1 = (int) (Math.random() * 5) + 1;
            int i2 = (int) (Math.random() * 5) + 1;
            System.out.println("(" + i1 + ", " + i2 + ")");
            if (i1 + i2 == 5) {
                break;
            }
        }
    }
}
