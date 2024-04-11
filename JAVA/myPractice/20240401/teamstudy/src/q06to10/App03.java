package q06to10;

public class App03 {

    public static void main(String[] args) {
        App03 app = new App03();
        app.q08();

    }

    public void q08() {
        int sum = 0;
        for (int i=1;i<=100;i++) {
            if (i%3 ==0) {
                sum += i;
            }
        }

        System.out.println(sum);
    }

}
