package com.jony.model;

import com.jony.Priority;
import com.jony.model.Client;
/**
 * Class representing a bank common client
 *
 * @author Jonatas Dourado
 * @version 0.1
 */
public class CommonClient extends Client {
    private Priority priority = Priority.NORMAL;

    @Override
    public Priority getPriority() {
        return priority;
    }
}
