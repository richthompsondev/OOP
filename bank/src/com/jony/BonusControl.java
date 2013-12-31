package com.jony;

public class BonusControl {
    private double sum;

    public double getSum() {
        return sum;
    }

    // For Employee manager = new Manager();
    public void register(Employee employee){
        this.sum = this.sum + employee.getBonus();
    }
}
