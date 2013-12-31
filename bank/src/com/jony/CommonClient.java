package com.jony.model;

import com.jony.model.Client;
/**
 * Class representing a bank common client
 *
 * @author Jonatas Dourado
 * @version 0.1
 */
public class CommonClient extends Client {
    static Client client  = new Client();

    public void setCommon() {
        client.setPriority(2);
    }
}
