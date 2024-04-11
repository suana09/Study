package Stream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class collectionStream {
    public static void main(String[] args) {
        String[] arr = new String[]{"강아지", "고양이", "토끼"};
        List<String> list = new ArrayList<String>(Arrays.asList(arr));

        Stream<String> stream = list.stream();

    }
}
