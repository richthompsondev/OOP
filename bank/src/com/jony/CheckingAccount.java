package com.jony;

// Conta corrente
public class CheckingAccount extends Account implements Taxable{
    public CheckingAccount(String name, int accountNumber, double balance, double limit) {
        super(name, accountNumber, balance, limit);
    }

    @Override
    synchronized boolean withdrawValue(double value) {
        double amountToWithdraw = value + 0.20;
        return super.withdrawValue(amountToWithdraw);
    }

    @Override
    public double getTaxAmount() {
        return super.getBalance() * 0.01;
    }
}
