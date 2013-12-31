package com.jony;
/**
 * Class for calculating taxes
 *
 * @author Jonatas Dourado
 * @version 0.1
 */
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
