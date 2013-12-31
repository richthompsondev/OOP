package com.jony.model;

import com.jony.InsufficientBalanceException;
import com.jony.Taxable;
import com.jony.model.Account;

// Conta corrente
public class CheckingAccount extends Account implements Taxable {
    public CheckingAccount(String name, int accountNumber, double balance, double limit) {
        super(name, accountNumber, balance, limit);
    }

    @Override
    synchronized void withdrawValue(double value) throws InsufficientBalanceException {
        double amountToWithdraw = value + 0.20;
        super.withdrawValue(amountToWithdraw);
    }

    @Override
    public double getTaxAmount() {
        return super.getBalance() * 0.01;
    }
}
