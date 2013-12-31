package com.jony;

// Conta corrente
public class CheckingAccount extends Account {
    public CheckingAccount(String name, int accountNumber, double balance, double limit) {
        super(name, accountNumber, balance, limit);
    }

    @Override
    synchronized boolean withdrawValue(double value) {
        double amountToWithdraw = value + 0.20;
        return super.withdrawValue(amountToWithdraw);
    }
    //private final String password;

    //public CheckingAccount(String clientPassword) {
        //password = clientPassword;
}
