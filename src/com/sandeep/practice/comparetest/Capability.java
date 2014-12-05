package com.sandeep.practice.comparetest;

/**
 * Created by sgholve on 11/17/14.
 */
public class Capability implements Comparable<Capability> {

    private String name;

    private Boolean status;

    public Capability() {
    }

    public Capability(String name, Boolean status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Capability that = (Capability) obj;
        if (this.getName() == that.getName()) {
            return true;
        }

        if(that.getName() == null) {
            return false;
        }

        return this.getName().equals(that.getName());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        return (prime * result + (name == null ? 0 : name.hashCode()));
    }

    @Override
    public int compareTo(Capability capability) {
        if(this == capability) {
            return 0;
        }

        if (capability == null || capability.getName() == null) {
            return -1;
        }

        if(this.getName() == null) {
            return 1;
        }

        return this.getName().compareTo(capability.getName());
    }

    @Override
    public String toString() {
        return "[Name = " + name + ", Status = " + status + "]";
    }
}

