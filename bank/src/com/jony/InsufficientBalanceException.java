package com.jony;

public class InsufficientBalanceException extends Exception{ //Exception Checked RuntimeException Unchecked
    public InsufficientBalanceException(String msg){
        super(msg);
    }
}
