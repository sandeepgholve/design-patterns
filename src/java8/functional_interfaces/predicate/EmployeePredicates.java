package java8.functional_interfaces.predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by sgholve on 9/14/15.
 */
public class EmployeePredicates {
    public static Predicate<Employee> isAdultMale = employee -> employee.getAge() > 21 && employee.getGender().equalsIgnoreCase("M");

    public static Predicate<Employee> isAdultFemale = employee -> employee.getAge() > 18 && employee.getGender().equalsIgnoreCase("F");

    public static Predicate<Employee> isAgeMoreThan(Integer age) {
        return employee -> employee.getAge() > age;
    }

    public static List<Employee> filterEmployees(List<Employee> employees, Predicate<Employee> predicate) {
        return employees.stream().filter(predicate).collect(Collectors.<Employee>toList());
    }
}

