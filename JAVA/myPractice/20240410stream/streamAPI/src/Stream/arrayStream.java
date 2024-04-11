package Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class arrayStream {
    public static void main(String[] args) {

        String[] arr = new String[]{"강아지", "고양이", "토끼"};
        Stream<String> stream = Arrays.stream(arr);

        stream.filter(arr1 -> arr1.contains("강아지"));


    }
}
