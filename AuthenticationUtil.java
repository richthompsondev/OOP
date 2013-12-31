package com.jony;
/**
 * Class using composition for authentication
 *
 * @author Jonatas Dourado
 * @version 0.1
 */
public class AuthenticationUtil {
    private int password;

    public void setPassword(int password) {
        this.password = password;
    }


    public boolean authenticate(int password) {
        if(this.password == password) {
            return true;
        } else {
            return false;
        }
    }
}
