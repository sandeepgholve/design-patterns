package com.sandeep.practice.protected_class;

/**
 * Created by sgholve on 11/25/14.
 */
public class ProtectedClass {
    protected ProtectedClass() {
        System.out.println("Protected CTor");
    }

    public static void main(String[] args) {
        ProtectedClass obj = new ProtectedClass();
    }
}
