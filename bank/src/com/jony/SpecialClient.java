package com.jony.model;

import com.jony.model.Client;
/**
 * Class representing a bank special client
 *
 * @author Jonatas Dourado
 * @version 0.1
 */
public class SpecialClient extends Client {
    static Client client  = new Client();

    public void setSpecial() {
        client.setPriority(3);
    }
}
