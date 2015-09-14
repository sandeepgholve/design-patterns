package java8.functional_interfaces;

import java.util.function.BiFunction;

/**
 * Created by sgholve on 9/14/15.
 */
public class BiFunctionTest {
    public static void main(String[] args) {

        BiFunction<Integer, String, String> biFunction = (key, value) -> "Key: " + key + ", Value: " + value;

        System.out.println(biFunction.apply(1, "Sandeep"));
    }
}
