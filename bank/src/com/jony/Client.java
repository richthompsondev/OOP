package com.jony;

public class Client extends Person implements Authentication {
    private int priority;
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

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

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
