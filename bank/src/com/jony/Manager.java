package com.jony;

public class Manager extends Employee{
    private int password;

    @Override
    public double getBonus() {
        return super.getBonus() + super.getSalary();
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public boolean authenticate(int password) {
        if (this.password == password) {
            return true;
        } else {
            return false;
        }
    }
}
