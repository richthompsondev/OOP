package com.jony.model;

import com.jony.model.Client;
/**
 * Class representing a bank low income client
 *
 * @author Jonatas Dourado
 * @version 0.1
 */
public class LowIncomeClient extends Client {
    static Client client  = new Client();

    public void setLowIncome() {
        client.setPriority(1);
    }
}
