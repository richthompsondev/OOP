package com.jony.model;
/**
 * Class representing a bank
 *
 * @author Jonatas Dourado
 * @version 0.1
 */
public class Bank {
    private String name;
    private int quantity;
    int accounts[] = new int[quantity];

    //Constructor
    public Bank(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    void searchAccount(int accountNumber) {

    }

    void insertAccount(int accountNumber, String owner) {

    }
}
