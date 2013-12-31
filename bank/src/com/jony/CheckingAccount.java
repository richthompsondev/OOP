package com.jony.model;

import com.jony.InsufficientBalanceException;
import com.jony.Taxable;
import com.jony.model.Account;

/**
 * Class representing a bank checking account
 *
 * @author Jonatas Dourado
 * @version 0.1
 */
// Conta Corrente
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

    @Override
    public String toString() {
        return "Checking account " + super.toString();
    }
}
