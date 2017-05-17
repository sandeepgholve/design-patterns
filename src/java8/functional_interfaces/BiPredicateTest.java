package java8.functional_interfaces;

import java.util.function.BiPredicate;

/**
 * Created by sgholve on 9/14/15.
 */
public class BiPredicateTest {
    public static void main(String[] args) {

        BiPredicate<Integer, String> biPredicate1 = (key, value) -> key == 1 && value.equals("Sandeep");
        BiPredicate<Integer, String> biPredicate2 = (key, value) -> key == 2 && value.equals("Gholve");

        System.out.println(biPredicate1.test(1, "Sandeep"));
        System.out.println(biPredicate1.test(2, "Gholve"));

        System.out.println(biPredicate2.test(1, "Sandeep"));
        System.out.println(biPredicate2.test(2, "Gholve"));

        // biPredicate2.and(biPredicate1.test(1, "Sandeep")).test(2, "Gholve");
        System.out.println("Combined one");
        System.out.println("And = " + biPredicate2.and(biPredicate1).test(1, "Sandeep"));
        System.out.println("Or = " + biPredicate2.or(biPredicate1).test(1, "Sandeep"));
        System.out.println("Negate = " + biPredicate2.or(biPredicate1).negate().test(1, "Sandeep"));
        System.out.println("Negate = " + biPredicate1.negate().or(biPredicate2).test(1, "Sandeep"));
    }
}
