package com.jony;

public class InternalSystem {
    private int password = 2222;

    public void autentica(Authentication auth){

        boolean authenticated = auth.authenticate(this.password);

        if(authenticated){
            System.out.println("Connected");
        } else {
            System.out.println("Connection denied");
        }
    }
}
