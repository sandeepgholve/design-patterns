package java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by sgholve on 2/19/15.
 */
public class FunctionalInterfaceTest {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

        Collections.sort(names, (a, b) -> a.compareTo(b));

        System.out.println(names);
    }
}
