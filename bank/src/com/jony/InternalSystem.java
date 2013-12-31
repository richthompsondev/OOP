package com.jony;
/**
 * Class simulating an authorization to log into the system
 *
 * @author Jonatas Dourado
 * @version 0.1
 */
public class InternalSystem {
    private int password = 2222;

    public void authenticate(Authentication auth){

        boolean authenticated = auth.authenticate(this.password);

        if(authenticated){
            System.out.println("Connected");
        } else {
            System.out.println("Connection denied");
        }
    }
}
