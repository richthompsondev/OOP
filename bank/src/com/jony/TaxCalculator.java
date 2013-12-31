package com.jony;

public class TaxCalculator {
    private double totalTax;

    public void register(Taxable taxable) {
        double value = taxable.getTaxAmount();
        this.totalTax += value;
    }

    public double getTotalTax() {
        return totalTax;
    }
}
