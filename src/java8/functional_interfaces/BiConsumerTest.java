package java8.functional_interfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * Created by sgholve on 9/14/15.
 */
public class BiConsumerTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Sandeep");
        map.put(2, "Kundlik");
        map.put(3, "Gholve");

        BiConsumer<Integer, String> biConsumer = (key, value) -> System.out.println("Key: " + key + ", Value: " + value);

        map.forEach(biConsumer);
    }
}
