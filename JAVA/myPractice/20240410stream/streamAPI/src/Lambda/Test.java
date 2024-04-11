package Lambda;

import java.util.Comparator;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {
        Stream<String> streamTest = Stream.of("판다", "불곰", "북극곰", "물개", "토끼");
        streamTest.filter(name -> name.contains("곰")).sorted(Comparator.reverseOrder()).forEach(System.out::println);


    }

}
