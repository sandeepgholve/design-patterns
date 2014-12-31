package com.sandeep.practice.enumtest.ordinaltest;

/**
 * Created by sgholve on 12/8/14.
 */
public enum ProvisioningJobState {

    /**
     * The state of the job instance is not known.
     */
    STATE_UNKNOWN(0),
    /**
     * The job is available for execution.
     */
    STATE_RUNNABLE(1),
    /**
     * The job is waiting to be executed.
     */
    @Deprecated
    STATE_WAITING(2),
    /**
     * The job is currently being executed,
     */
    STATE_RUNNING(3),
    /**
     * The job has failed.
     */
    STATE_FAILED(4),
    /**
     * The job has been successfully executed.
     */
    STATE_SUCCEEDED(5),
    /**
     * Job is running, but it's possible to execute next job (parallel execution).
     */
    @Deprecated
    STATE_CONTINUE(6),
    /**
     * Job will be send to target
     */
    STATE_SEND(7),
    /**
     * Job is manifested
     */
    STATE_MANIFESTED_JOB(8),
    /**
     * Job is group manifested
     */
    STATE_MANIFESTED_GROUP(9),
    /**
     * Job timed out (appserver did not receive an on progress or result state for the job in time)
     */
    STATE_TIMEOUT(10),
    /**
     * Job was cancelled because a previous job failed unrecoverably.
     */
    STATE_CANCELLED(11),
    /**
     * The job has been partially successfully executed.
     */
    STATE_PARTIALLY_SUCCEEDED(15);

    private final int index;

    private ProvisioningJobState(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    /**
     * Retrieve a specific instance by its index.
     * <p>
     * @param index The desired index
     * <p>
     * @return the matching instance
     * <p>
     * @throws IllegalArgumentException if no instance corresponds to the given index
     */
    public static ProvisioningJobState byIndex(int index) {
        for (ProvisioningJobState state : values()) {
            if (state.index == index) {
                return state;
            }
        }
        throw new IllegalArgumentException("No ProvisioningJobState available for index '" + index + "'");
    }
}
