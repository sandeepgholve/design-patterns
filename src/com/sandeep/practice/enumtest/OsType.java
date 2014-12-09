/**
 * Copyright (c) 2011 ProfitBricks GmbH. All Rights Reserved.
 */
package com.sandeep.practice.enumtest;

public enum OsType {

    UNKNOWN("unknown"),
    WINDOWS("windows"),
    LINUX("linux"),
    OTHER("other");

    private String osType;

    private OsType(String osType) {
        this.osType = osType;
    }

    public static OsType fromValue(String value) {
        for (OsType type : OsType.values()) {
            if (type.toString().equals(value)) {
                return type;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
