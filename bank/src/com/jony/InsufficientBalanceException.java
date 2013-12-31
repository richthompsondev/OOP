package com.jony;
/**
 * Class for insufficient balance exception
 *
 * @author Jonatas Dourado
 * @version 0.1
 */
public class InsufficientBalanceException extends Exception{ //Exception Checked RuntimeException Unchecked
    public InsufficientBalanceException(String msg){
        super(msg);
    }
}
