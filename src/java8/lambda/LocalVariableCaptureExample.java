package java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by sandeep on 02.12.14.
 */
public class LocalVariableCaptureExample {
    private static int staticVar = 20;

    public static void main(String[] args) {
        List<Integer> intSeq = Arrays.asList(1, 2, 3);

        // Local variable capture example
        int externalVar = 10;
        Consumer<Integer> consumer = x -> System.out.println(x + externalVar);
        intSeq.forEach(consumer);

        // Static variable capture example
        consumer = x -> System.out.println(x + staticVar);

        intSeq.forEach(consumer);
        // Method reference Example
        intSeq.forEach(System.out::println);

        // Stream example
        int sum = intSeq.stream().map(x -> x*x).reduce((x,y)-> x+y).get();
        System.out.println(sum);
    }
}
