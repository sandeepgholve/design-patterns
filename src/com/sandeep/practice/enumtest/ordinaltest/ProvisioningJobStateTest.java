package com.sandeep.practice.enumtest.ordinaltest;

/**
 * Created by sgholve on 12/8/14.
 */
public class ProvisioningJobStateTest {
    public static void main (String[] args) {
        for(ProvisioningJobState state : ProvisioningJobState.values()) {
            System.out.println(state + " = " + state.ordinal() + ". Index = " + state.getIndex());
        }
    }
}
