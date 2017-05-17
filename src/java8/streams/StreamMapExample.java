package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,1,2,2,3,4,5);

        // Stream - Map along with distinct
        List<Integer> squareList = integerList.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        squareList.forEach(System.out::println);

        System.out.println("----------------------------");

        squareList = integerList.stream().map( i -> i*i).collect(Collectors.toList());
        squareList.forEach(System.out::println);

        System.out.println("----------------------------");

        // Stream - Filter
        squareList = integerList.stream().filter(i -> i%2 == 0).map( i -> i*i).collect(Collectors.toList());
        squareList.forEach(System.out::println);

        System.out.println("----------------------------");

        // Stream - limit
        squareList = integerList.stream().limit(3).collect(Collectors.toList());
        squareList.forEach(System.out::println);
    }
}
