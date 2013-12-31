package com.jony;

public class Main {

    public static void main(String[] args) {
        //Instances
        Account acc1 = new Account("Jonatas", 123, 1.01);
        Account acc2 = new Account("階戸瑠李", 321, 1000000);

        System.out.println("Nome: " + acc1.client.getName());
        System.out.println("Conta: " + acc1.getAccountNumber());
        System.out.println("Saldo: " + acc1.getBalance());

        acc1.depositValue(20);
        acc1.withdrawValue(20.50);

        System.out.println();
        System.out.println("Nome: " + acc2.client.getName());
        System.out.println("Conta: " + acc2.getAccountNumber());
        System.out.println("Saldo: " + acc2.getBalance());

        acc2.depositValue(20);
        acc2.withdrawValue(20.50);
    }

}
