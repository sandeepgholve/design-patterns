package java8.functional_interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Predicate;

public class ConsumerTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Sandeep");
        map.put(2, "Kundlik");
        map.put(3, "Gholve");

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        Consumer<String> stringConsumer = (value) -> list1.add(value);
        Predicate<String> stringPredicate = (value) -> list2.add(value);

        Consumer<String> consumer = (value) -> System.out.println(value);
        BiConsumer<Integer, String> biConsumer = (key, value) -> System.out.println("Key: " + key + ", Value: " + value);
        DoubleConsumer doubleConsumer = val -> System.out.println("Double Consumed Value: " + val);



        System.out.println("--------------------");
        map.forEach(biConsumer);
        System.out.println("--------------------");
        map.values().forEach(consumer);
        System.out.println("--------------------");

        map.values().forEach(stringConsumer);
        list1.forEach(consumer);
        System.out.println("--------------------");
        list2.forEach(consumer);
        System.out.println("--------------------");

        Double d = 2.0;
        doubleConsumer.accept(d);
    }
}
