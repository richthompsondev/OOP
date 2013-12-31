package com.jony;

public interface Authentication {
    void setPassword(int password);
    boolean authenticate(int password);
}
