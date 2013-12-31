package com.jony;

public class Manager extends Employee implements Authentication{
    private double bonus;

    private AuthenticationUtil authenticator;

    // When creating a client, also create an util authentication internally
    public Manager(){
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

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
