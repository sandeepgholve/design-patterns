package com.sandeep.practice.comparetest;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by sgholve on 11/17/14.
 */
public class CapabilityCompareTest {
    public static void main(String[] args) {
        Set<Capability> capabilitySet = new TreeSet<>();

        Capability capability1 = new Capability("A", true);
        Capability capability2 = new Capability("A", false);
        Capability capability3 = new Capability("B", true);
        Capability capability4 = new Capability("", true);
        Capability capability5 = new Capability(null, false);
        Capability capability6 = new Capability(null, null);

        capabilitySet.add(capability1);
        capabilitySet.add(capability2);
        capabilitySet.add(capability3);
        capabilitySet.add(capability4);
        capabilitySet.add(capability5);
        capabilitySet.add(capability6);

        System.out.println(capabilitySet);

        OsType osType = OsType.valueOf("UNIX");
        System.out.println(osType);
        osType = OsType.valueOf("Sandeep");
        System.out.println(osType);
    }
}
