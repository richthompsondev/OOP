package com.jony;

public class BonusControl {
    private double sum;

    public double getSum() {
        return sum;
    }
    // For Employee manager = new Manager();
    public void register(Employee employee){
        double bonus = employee.getBonus();
        this.sum = this.sum + bonus;
    }
}
