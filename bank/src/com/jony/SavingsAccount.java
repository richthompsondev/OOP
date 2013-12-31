package com.jony;

public class SavingsAccount extends Account {

    public SavingsAccount(String name, int accountNumber, double balance, double limit) {
        super(name, accountNumber, balance, limit); // Can't creat construct in child class without it
    }
}
