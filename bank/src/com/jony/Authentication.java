package com.jony;

public interface Authentication {
    public void setPassword(int password);
    public boolean authenticate(int password);
}
