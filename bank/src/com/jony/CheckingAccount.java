package com.jony;

/**
 * Class representing a bank checking account
 *
 * @author Jonatas Dourado
 * @version 0.1
 */
// Conta Corrente
public class CheckingAccount extends Account implements Taxable {
    public CheckingAccount(Client client, int agency, int accountNumber, double balance, double limit) {
        super(client, agency, accountNumber, balance, limit);
    }
    public CheckingAccount(Client client, int agency, int accountNumber, double balance) {
        super(client, agency, accountNumber, balance);
    }

    @Override
    public synchronized void withdrawValue(double value) throws InsufficientBalanceException {
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
