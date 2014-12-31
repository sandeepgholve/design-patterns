package com.sandeep.practice.enumtest;

/**
 * Created by sgholve on 12/12/14.
 */
public class Server {
    private Boolean reboot;
    private String name;

    public Boolean getReboot() {
        return reboot;
    }

    public void setReboot(Boolean reboot) {
        this.reboot = reboot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Server{" +
                "reboot=" + reboot +
                ", name='" + name + '\'' +
                '}';
    }
}
