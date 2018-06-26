package java8.method_reference;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList();
        names.add("Sandeep");
        names.add("Sagar");
        names.add("Milind");
        names.add("Rihan");
        names.add("Anay");

        names.forEach(System.out::println);
        names.removeIf(name -> name.equals("Sandeep"));
        System.out.println("--------------");
        names.forEach(System.out::println);
        System.out.println("--------------");
        names.stream().limit(2).forEach(System.out::println);
        System.out.println("--------------");
        System.out.println(names.stream().collect(Collectors.joining("--")));
    }
}
