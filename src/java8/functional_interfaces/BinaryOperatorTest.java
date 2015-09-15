package java8.functional_interfaces;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;

public class BinaryOperatorTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("X", "A");
        map.put("Y", "B");
        map.put("Z", "C");

        binaryOperatorFun((s1, s2) -> s1 + "-" + s2, map).forEach(System.out::println);

        Map<Double, Double> doubleMap = new HashMap<>();
        doubleMap.put(1.0, 1.0);
        doubleMap.put(2.0, 2.0);
        doubleMap.put(3.0, 3.0);
        doubleMap.put(4.0, 4.0);

        binaryOperatorFun((s1, s2) -> s1 + s2, doubleMap).forEach(System.out::println);
    }

    private static List<String> binaryOperatorFun(BinaryOperator<String> binaryOperator, Map<String, String> map) {
        List<String> biList = new ArrayList<>();
        map.forEach((s1, s2) -> biList.add(binaryOperator.apply(s1, s2)));
        return biList;
    }

    private static List<Double> binaryOperatorFun(DoubleBinaryOperator doubleBinaryOperator, Map<Double, Double> map) {
        List<Double> biList = new ArrayList<>();
        map.forEach((s1, s2) -> biList.add(doubleBinaryOperator.applyAsDouble(s1, s2)));
        return biList;
    }


}
