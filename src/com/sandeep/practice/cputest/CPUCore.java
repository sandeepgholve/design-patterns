package com.sandeep.practice.cputest;

/**
 * Created by sgholve on 12/4/14.
 */
public class CPUCore {
    private Long index;
    private String name;
    private String pserverName;

    public CPUCore(Long index, String name, String pserverName) {
        this.index = index;
        this.name = name;
        this.pserverName = pserverName;
    }

    public Long getIndex() {
        return index;
    }

    public void setIndex(Long index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPserverName() {
        return pserverName;
    }

    public void setPserverName(String pserverName) {
        this.pserverName = pserverName;
    }

    @Override
    public String toString() {
        return "CPUCore{" +
                "index=" + index +
                ", name='" + name + '\'' +
                ", pserverName='" + pserverName + '\'' +
                '}';
    }
}
