package com.jony;
/**
 * Enum representing the priorities
 *
 * @author Jonatas Dourado
 * @version 0.1
 */
// Could be used with button state or seasons
public enum Priority {
    MIN(1), NORMAL(5), MAX(10);

    private int value;
    Priority(int value){
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
