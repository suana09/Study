package Stream;

import java.util.stream.Stream;

public class streamBuilder {
    public static void main(String[] args) {

        Stream.Builder<String> streamBuilder = Stream.builder();

        streamBuilder.add("강아지");
        streamBuilder.add("고양이");
        streamBuilder.add("토끼");

        Stream<String> streamB = Stream.<String>builder().build();


    }

}


