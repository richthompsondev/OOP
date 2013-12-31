package com.jony.model;

import com.jony.Authentication;
import com.jony.AuthenticationUtil;
import com.jony.InsufficientBalanceException;
import com.jony.Priority;

import java.util.Objects;

/**
 * Abstract class representing a bank account
 *
 * @author Jonatas Dourado
 * @version 0.1
 */
public abstract class Account implements Authentication, Comparable<Account> {
    private Priority priority;
    private Client client;
    private int agency;
    private int accountNumber;
    private double balance;
    private double limit;
    private double loanTotal;
    private AuthenticationUtil authenticator;

    // Constructors
    public Account(Client client, int agency, int accountNumber, double balance, double limit) {
        if(agency < 1) {
            throw new IllegalArgumentException("Invalid agency number");
        }
        if(accountNumber < 1) {
            throw new IllegalArgumentException("Invalid account number");
        }
        if(balance < 0) {
            this.balance = 0;
            throw new IllegalArgumentException("Invalid balance");
        }
        this.client = client; //assuming each new account creates a new client
        this.agency = agency;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Account(Client client, int agency, int accountNumber, double balance) {
        // Initial limit = 1000 just for example
        this(client, agency, accountNumber, balance, 1000);
    }

    public String getHolderName() {
        return client.getName();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public double getLoanTotal() {
        return loanTotal;
    }

    public void setLoanTotal(double loanTotal) {
        this.loanTotal = loanTotal;
    }

    synchronized boolean depositValue(double value) {
        this.balance += value;
        System.out.println("Depósito realizado. Saldo atual: " + this.balance);
        return true;
    }

    synchronized void withdrawValue(double value) throws InsufficientBalanceException{
        if (this.balance < value) {
            throw new InsufficientBalanceException("Saldo insuficiente.");
        }
        this.balance -= value;
        System.out.println("Saque realizado. Saldo atual: " + this.balance);
        // IllegalArgumentException error = new IllegalArgumentException()
        // throw error
    }

    synchronized void transferValue(Account destination, double value) throws InsufficientBalanceException{
        this.withdrawValue(value);
        destination.depositValue(value);
    }

    synchronized boolean accountsLoan(double value) {
        if(this.loanTotal <= value){
            double loanTotal = value;
            this.loanTotal = this.loanTotal + loanTotal;
            balance = balance + value;
            System.out.println("Empréstimo realizado. Saldo atual: " + this.balance);
            return true;
        }
        System.out.println("Erro. Valor do empréstimo acima do permitido.");
        return false;
    }

    @Override
    public boolean equals(Object ref) {
        Account another = (Account) ref;

        if(this.agency != another.agency) {
            return false;
        }
        if(this.accountNumber != another.accountNumber) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(agency, accountNumber);
    }

    @Override
    public void setPassword(int password) {
        this.authenticator.setPassword(password);
    }

    @Override
    public boolean authenticate(int password) {
        return this.authenticator.authenticate(password);
    }

    // Implementing natural order — balance sorting
    @Override
    public int compareTo(Account another) {
        return Double.compare(this.balance, another.balance);
    }

    @Override
    public String toString() {
        return "number: " + this.accountNumber;
    }
}