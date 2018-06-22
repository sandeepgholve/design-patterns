package java8.reflection;

import java.util.Calendar;

public class ClassDescriptorSample {

	public static void main(String[] args) {
		System.out.println("Trying ClassName.class keyword:");
		System.out.println("Object class: " + Object.class);
		System.out.println("String class: " + String.class);
		System.out.println("String[] class: " + String[].class);
		System.out.println("Class for int: " + int.class);
		System.out.println("Calender class: " + Calendar.class);
	}

}
