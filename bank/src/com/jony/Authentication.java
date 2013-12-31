package com.jony;
/**
 * Interface to be signed by an authenticable account
 *
 * @author Jonatas Dourado
 * @version 0.1
 */
public interface Authentication {
    void setPassword(int password);
    boolean authenticate(int password);
}
