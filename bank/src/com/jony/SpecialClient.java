package com.jony;

import com.jony.Priority;

/**
 * Class representing a bank special client
 *
 * @author Jonatas Dourado
 * @version 0.1
 */
public class SpecialClient extends Client {
    private Priority priority = Priority.MAX;

    @Override
    public Priority getPriority() {
        return priority;
    }
}
