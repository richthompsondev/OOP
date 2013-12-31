package com.jony.model;

import com.jony.model.Account;
/**
 * Class representing a bank saving account
 *
 * @author Jonatas Dourado
 * @version 0.1
 */
public class SavingsAccount extends Account {

    public SavingsAccount(String name, int accountNumber, double balance, double limit) {
        super(name, accountNumber, balance, limit); // Can't creat construct in child class without it
    }
}
