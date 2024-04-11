package Stream;

import java.util.stream.Stream;

public class emptyStream {
    public static void main(String[] args) {

        Stream streamEmpty = Stream.empty();

        Stream<String> stream1 = Stream.of("강아지", "고양이", "토끼");
        Stream<String> stream2 = Stream.of("호랑이", "사자", "곰");

        Stream<String> streamConCat = Stream.concat(stream1, stream2);


    }
}
