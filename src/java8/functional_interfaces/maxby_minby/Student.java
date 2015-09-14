package java8.functional_interfaces.maxby_minby;

/**
 * Created by sgholve on 9/14/15.
 */
public class Student {
    private String name;
    private Integer age;
    private String className;

    public Student(String name, Integer age, String className) {
        this.name = name;
        this.age = age;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getClassName() {
        return className;
    }
}
