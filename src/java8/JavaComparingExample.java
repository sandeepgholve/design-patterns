package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Sandeep on 17-09-2015.
 */
public class JavaComparingExample {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Sandeep", 32));
        persons.add(new Person("Milind", 34));
        persons.add(new Person("Sagar", 30));
        persons.add(new Person("Asha", 28));
        persons.add(new Person("Anita", 28));
        persons.add(new Person("Sonali", 27));

        persons.sort(Comparator.comparing(Person::getAge).thenComparing(Person::getName));
        persons.forEach(System.out::println);
    }
}

class Person {
    private int age;
    private String name;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
