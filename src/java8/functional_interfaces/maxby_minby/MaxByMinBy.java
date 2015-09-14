package java8.functional_interfaces.maxby_minby;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

/**
 * Created by sgholve on 9/14/15.
 */
public class MaxByMinBy {
    public static void main(String[] args) {
        Student s1 = new Student("Shyam", 22,"A");
        Student s2 = new Student("Ram",23,"A");
        Student s3 = new Student("Mohan",22,"B");
        Student s4 = new Student("Ramesh",21,"B");
        List<Student> list = Arrays.asList(s1, s2, s3, s4);

        Comparator<Student> ageComparator = Comparator.comparing(Student::getAge);

        // Using BinaryOperator.maxBy
        System.out.println(" --- BinaryOperator.maxBy --- ");
        Map<String, Optional<Student>> eldestByClass =
                list.stream().
                        collect(Collectors.
                                groupingBy(Student::getClassName, Collectors.reducing(BinaryOperator.maxBy(ageComparator))));
        eldestByClass.forEach((k, v) -> System.out.println("Class: " + k + ", Age: " +
                ((Optional<Student>)v).get().getAge() + " Name:" + ((Optional<Student>)v).get().getName()));

        // Using BinaryOperator.maxBy
        System.out.println(" --- BinaryOperator.minBy --- ");
        Map<String, Optional<Student>> yongerByClass =
                list.stream().
                        collect(Collectors.
                                groupingBy(Student::getClassName, Collectors.reducing(BinaryOperator.minBy(ageComparator))));
        yongerByClass.forEach((k, v) -> System.out.println("Class: " + k + ", Age: " +
                ((Optional<Student>)v).get().getAge() + " Name:" + ((Optional<Student>)v).get().getName()));
    }
}
