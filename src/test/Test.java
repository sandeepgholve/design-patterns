package test;

import java.util.*;

public class Test {
    public static void main (String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.maxMemory());
        Map<Integer, String> map = new HashMap<>(10);
        map.put(1,"sam");
        map.put(1,"Ian");
        map.putIfAbsent(1,"Scott");
        map.put(null,"asdf");
        System.out.println(map);
        System.out.println(1 << 30);
        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(1 << 10));
    }
}
