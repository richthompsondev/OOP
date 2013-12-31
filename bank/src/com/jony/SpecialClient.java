package com.jony;

public class SpecialClient extends Client {
    static Client client  = new Client();

    public void setSpecial() {
        client.setPriority(3);
    }
}
