package com.jony.model;

import com.jony.Taxable;
/**
 * Class representing life insurance
 *
 * @author Jonatas Dourado
 * @version 0.1
 */
public class LifeInsurance implements Taxable {
    @Override
    public double getTaxAmount() {
        return 42;
    }
}
