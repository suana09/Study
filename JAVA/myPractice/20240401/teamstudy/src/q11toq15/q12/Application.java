package q11toq15.q12;

public class Application {
    public static void main(String[] args) {

        int[] lottos = new int[44];

        for (int i = 0; i < lottos.length; i++) {
            lottos[i] = i + 1;
            System.out.print(lottos[i]+" ");
        }

        System.out.println();

        int[] randomSix = new int[6];
        int temp;
        for (int i = 0; i < randomSix.length; i++) {
            randomSix[i] = lottos[(int) ((Math.random()*6)+1)];

        }

        for (int j = randomSix.length - 1; j>=0; j--){
            for (int k = 0; k<j; k++) {
                if (randomSix[k] > randomSix[k+1]) {
                    temp = randomSix[k];
                    randomSix[k] = randomSix[k + 1];
                    randomSix[k + 1] = temp;
                }
            }

        }

        System.out.println();
        for (int i = 0; i < randomSix.length; i++) {
            System.out.print(randomSix[i]+ " ");

        }



    }


}
