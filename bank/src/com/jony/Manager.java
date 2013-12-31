package com.jony;

public class Manager extends Employee{
    private int password;
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
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
