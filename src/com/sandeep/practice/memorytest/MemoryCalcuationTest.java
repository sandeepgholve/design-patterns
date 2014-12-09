package com.sandeep.practice.memorytest;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sgholve on 12/3/14.
 */
public class MemoryCalcuationTest {
    public static void main(String[] args) {
        Memory baseMemory = new Memory(1, 1024);
        Memory availableMemory = new Memory(3, 1024);
        Memory toBeUpdatedMemory = new Memory(-2, 1024);

        List<Memory> memories = Arrays.asList(baseMemory, availableMemory, toBeUpdatedMemory);

        long targetRamInMb = 0;
        for (Memory memory : memories) {
            targetRamInMb += memory.getCount() * memory.getSize();
        }
        System.out.println(targetRamInMb);
    }
}
