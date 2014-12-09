package com.sandeep.practice.cputest;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sgholve on 12/4/14.
 */
public class CPUUnitTest {
    public static void main(String[] args) {
        List<Long> currentCPUUnits = Arrays.asList(40L, 41L, 42L);

        CPUCore core1 = new CPUCore(Long.valueOf(40), "pserver1101-core-40", "pserver1101");
        CPUCore core2 = new CPUCore(Long.valueOf(41), "pserver1101-core-41", "pserver1101");
        CPUCore core3 = new CPUCore(Long.valueOf(42), "pserver1101-core-42", "pserver1101");
        CPUCore core4 = new CPUCore(Long.valueOf(43), "pserver1101-core-43", "pserver1101");
        CPUCore core5 = new CPUCore(Long.valueOf(44), "pserver1101-core-44", "pserver1101");
        CPUCore core6 = new CPUCore(Long.valueOf(45), "pserver1101-core-45", "pserver1101");
        CPUCore core7 = new CPUCore(Long.valueOf(46), "pserver1101-core-46", "pserver1101");

        CPUUnit cpuUnit1 = new CPUUnit(core1, CPUState.AVAILABLE, 1);
        CPUUnit cpuUnit2 = new CPUUnit(core2, CPUState.AVAILABLE, 2);
        CPUUnit cpuUnit3 = new CPUUnit(core3, CPUState.AVAILABLE, 3);
        CPUUnit cpuUnit4 = new CPUUnit(core4, CPUState.TO_BE_CREATED, 4);
        CPUUnit cpuUnit5 = new CPUUnit(core5, CPUState.TO_BE_CREATED, 5);

        List<CPUUnit> cpuUnits = Arrays.asList(cpuUnit1, cpuUnit2, cpuUnit3, cpuUnit4, cpuUnit5);

        /**
         * Up-scaling Use Case
         *
         */
        System.out.println(cpuUnits);
        System.out.println();
        System.out.println(processPartialSuccess(cpuUnits, currentCPUUnits));
    }

    public static List<CPUUnit> processPartialSuccess(List<CPUUnit> cpuUnits, List<Long> currentCPUUnits) {
        for (CPUUnit unit : cpuUnits) {
            if (currentCPUUnits.contains(unit.getCpuCore().getIndex())) {
                if(unit.getCpuState() == CPUState.TO_BE_DELETED) {
                    unit.setCpuState(CPUState.TO_BE_CREATED);
                }
            } else {
                if(unit.getCpuState() != CPUState.AVAILABLE) {
                    unit.setCpuState(CPUState.TO_BE_DELETED);
                }
            }
        }
        return cpuUnits;
    }

}
