package java8.functional_interfaces;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, String> integerStringFunction = val -> "Age: " + val;
        System.out.println(integerStringFunction.apply(31));

        IntFunction<String> intFunction = val -> "Age: " + val;
        System.out.println(intFunction.apply(31));

        IntToDoubleFunction intToDoubleFunction = val -> val * 1.0;
        System.out.println(intToDoubleFunction.applyAsDouble(31));
    }
}
