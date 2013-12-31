package com.jony.model;

import com.jony.Authentication;
import com.jony.AuthenticationUtil;
import com.jony.model.Employee;
/**
 * Class representing a manager role
 *
 * @author Jonatas Dourado
 * @version 0.1
 */
public class Manager extends Employee implements Authentication {
    private double bonus;

    private AuthenticationUtil authenticator;

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
