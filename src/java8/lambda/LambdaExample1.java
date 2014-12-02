package java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by sandeep on 02.12.14.
 */
public class LambdaExample1 {
    public static void main(String[] args) {
        List<Integer> intSeq = Arrays.asList(1,2,3);

        //intSeq.forEach(x -> System.out.println(x));

        /*
        intSeq.forEach((Integer x) -> {
            x += 2;
            System.out.println(x);
        });
        */

        Consumer<Integer> consumer = x -> System.out.println(x);
        intSeq.forEach(consumer);
    }
}
