package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * Created by sgholve on 9/25/15.
 */
public class StreamMapExample2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java8", "Lambdas", "In", "Action");

        Consumer<Integer> intConsumer = System.out::println;
        Consumer<String> stringConsumer =  System.out::println;

        words.forEach(stringConsumer);

        List<Integer> wordLenghts = words.stream().map(String::length).collect(Collectors.toList());
        wordLenghts.forEach(intConsumer);

        System.out.println("-------------------");

        List<Integer> numbers = Arrays.asList(0,1,2,3,4,5);

        List<Integer> squareOfNumbers = numbers.stream().map(n -> n*n).collect(Collectors.toList());
        squareOfNumbers.forEach(System.out::println);
        System.out.println("-------------------");
        System.out.println(numbers.stream().reduce(0, (a,b) -> a+b)); // Returns Integer
        System.out.println(numbers.stream().reduce((a,b) -> a+b)); // Returns Optional<Integer>
        System.out.println("-------------------");
        System.out.println("Max: " + numbers.stream().reduce(0, Integer::max));
        System.out.println("Min: " + numbers.stream().reduce(0, Integer::min));
    }
}
