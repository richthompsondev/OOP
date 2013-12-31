package com.jony.model;

import com.jony.*;
/**
 * Class representing a bank general client
 *
 * @author Jonatas Dourado
 * @version 0.1
 */
public abstract class Client extends Person implements Authentication {
    private CheckingAccount checkingAccount;
    private SavingsAccount savingsAccount;

    private AuthenticationUtil authenticator;

    // When creating a client, also create an util authentication internally - composition.
    public Client(){
        this.authenticator = new AuthenticationUtil();
    }

    @Override
    public void setPassword(int password) {
        this.authenticator.setPassword(password);
    }

    @Override
    public boolean authenticate(int password) {
        return this.authenticator.authenticate(password);
    }

    public abstract Priority getPriority();

    public CheckingAccount getCheckingAccount() {
        return checkingAccount;
    }

    public void setCheckingAccount(CheckingAccount checkingAccount) {
        this.checkingAccount = checkingAccount;
    }

    public SavingsAccount getSavingsAccount() {
        return savingsAccount;
    }

    public void setSavingsAccount(SavingsAccount savingsAccount) {
        this.savingsAccount = savingsAccount;
    }
}
