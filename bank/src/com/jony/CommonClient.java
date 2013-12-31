package com.jony;

public class CommonClient extends Client{
    static Client client  = new Client();

    public void setCommon() {
        client.setPriority(2);
    }
}
