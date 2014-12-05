package com.sandeep.practice.cputest;

/**
 * Created by sgholve on 12/4/14.
 */
public class CPUUnit {
    private CPUCore cpuCore;
    private CPUState cpuState;
    private int index;

    public CPUUnit(CPUCore cpuCore, CPUState cpuState, int index) {
        this.cpuCore = cpuCore;
        this.cpuState = cpuState;
        this.index = index;
    }

    public CPUCore getCpuCore() {
        return cpuCore;
    }

    public void setCpuCore(CPUCore cpuCore) {
        this.cpuCore = cpuCore;
    }

    public CPUState getCpuState() {
        return cpuState;
    }

    public void setCpuState(CPUState cpuState) {
        this.cpuState = cpuState;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "CPUUnit{" +
                "cpuCore=" + cpuCore +
                ", cpuState=" + cpuState +
                ", index=" + index +
                '}';
    }
}
