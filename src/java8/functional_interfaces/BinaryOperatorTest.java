package java8.functional_interfaces;

import java.util.*;
import java.util.function.BinaryOperator;

/**
 * Created by sgholve on 9/14/15.
 */
public class BinaryOperatorTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("X", "A");
        map.put("Y", "B");
        map.put("Z", "C");

        binaryOperatorFun((s1, s2) -> s1 + "-" + s2 , map).forEach(System.out::println);
    }

    private static List<String> binaryOperatorFun(BinaryOperator<String> binaryOperator, Map<String, String> map) {
        List<String> biList = new ArrayList<>();
        map.forEach((s1, s2) -> biList.add(binaryOperator.apply(s1, s2)));
        return biList;
    }


}
