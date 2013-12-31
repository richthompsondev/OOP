package com.jony;

public class LowIncomeClient extends Client{
    static Client client  = new Client();

    public void setLowIncome() {
        client.setPriority(1);
    }
}
