package java8.functional_interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * Created by sgholve on 9/14/15.
 */
public class UnaryOperatorTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

        unaryOperatorFun(i -> i*i, list).forEach(System.out::println);
    }

    private static List<Integer> unaryOperatorFun(UnaryOperator<Integer> unaryOperator, List<Integer> list) {
        List<Integer> uniList = new ArrayList<>();
        list.forEach(i -> uniList.add(unaryOperator.apply(i)));
        return uniList;
    }
}
