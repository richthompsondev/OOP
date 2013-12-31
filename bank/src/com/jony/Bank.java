package com.jony;

import java.util.ArrayList;

/**
 * Class representing a bank
 *
 * @author Jonatas Dourado
 * @version 0.1
 */
public class Bank {
    ArrayList<Account> accountList = new ArrayList<Account>();

    public int searchAccount(Account account) {
        return accountList.indexOf(account);
    }
    public void insertAccount(Account account) {
        accountList.add(account);
    }
    public void listAccounts() {
        for(Account account : accountList) {
            System.out.println(account);
        }
    }
    public boolean contaisAccount(Account account) {
        return accountList.contains(account);
    }
}
