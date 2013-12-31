package com.jony;

public class Main {

	public static void main(String[] args) {
		//Instances
		Account acc1 = new Account("Jonatas", 123, 1200.01);
		//BankAccount acc2 = new BankAccount("階戸瑠李", 321, 1000000);
		
		acc1.setBalance(1200.01);
		acc1.depositValue(20);
		System.out.println("Depósito realizado. Saldo atual: " + acc1.getBalance());
		acc1.withdrawValue(15.50);
		System.out.println("Saque realizado. Saldo atual: " + acc1.getBalance());
		System.out.println(acc1.getAccountNumber());
	}

}
