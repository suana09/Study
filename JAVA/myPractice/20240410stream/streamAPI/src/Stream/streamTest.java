package Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streamTest {
    public static void main(String[] args) {


        Stream<String> stream1 = Stream.of("불곰", "판다", "북극곰");
        stream1.filter(animal -> animal.contains("곰")).forEach(System.out::println);
        System.out.println("=======================");



        Stream<String> stream2 = Stream.of("강아지", "판다", "강아지", "토끼");
        stream2.distinct().forEach(System.out::println);
        System.out.println("=======================");


        Stream<String> stream3 = Stream.of("fubao", "ruibao", "huibao");
        stream3.map(String::toUpperCase).forEach(System.out::println);
        System.out.println("=======================");

        Stream<String> stream4 = Stream.of("fubao", "ruibao", "huibao");
        stream4.sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println("=======================");

        /*Stream<Integer> stream5 = Stream.of(1, 9, 340, 83, 9);
        int sum = stream5.peek(System.out::println).min();*/

        IntStream stream6 = IntStream.of(5, 18, 92, 33, 78, 1);
        OptionalInt max = stream6.max();
        System.out.println("=======================");


        IntStream stream7 = IntStream.of(1, 2, 3, 4, 5);
        int fac = stream7.reduce(1, (facnum, num) -> facnum * num);
        System.out.println(fac);
        System.out.println("=======================");

        Stream<String> stream8 = Stream.of("fubao", "ruibao", "huibao");
        List<String> list = stream8.map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(list);
        System.out.println("=======================");

        Stream<String> stream9 = Stream.of("불곰", "판다", "북극곰");
        String join = stream9.filter(animal -> animal.contains("곰")).collect(Collectors.joining(", ", "[", "]"));
        System.out.println(join);
        System.out.println("=======================");

        /*IntStream stream10 = IntStream.of(5, 18, 92, 33, 78, 1);
        Double avg = stream10.collect(Collectors.averagingInt(stream10));*/

        Stream<String> stream10 = Stream.of("fubao", "ruibao", "huibao");
        boolean noneMatch = stream10.noneMatch(baos -> baos.contains("bao"));
        System.out.println(noneMatch);
        System.out.println("=======================");

        Stream<String> stream11 = Stream.of("fubao", "ruibao", "huibao");
        stream11.forEach(System.out::println);
        System.out.println("=======================");


    }

    public void printMethod(int i, String name, int price) {
        System.out.println("["+i+"] "+name+" : "+price);
    }

}
