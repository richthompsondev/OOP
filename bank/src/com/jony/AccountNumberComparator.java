package com.jony;

import com.jony.model.Account;
import java.util.Comparator;

/**
 * Class for list sorting
 *
 * @author Jonatas Dourado
 * @version 0.1
 */

public class AccountNumberComparator implements Comparator<Account> {
    @Override
    public int compare(Account a1, Account a2) {
        return Integer.compare(a1.getAccountNumber(), a2.getAccountNumber());
    }
}

/*
*
public class Test {
     Conta cc1 = new ContaCorrente(22, 33);
    cc1.deposita(333.0);

    Conta cc2 = new ContaPoupanca(22, 44);
    cc2.deposita(444.0);

    Conta cc3 = new ContaCorrente(22, 11);
    cc3.deposita(111.0);

    Conta cc4 = new ContaPoupanca(22, 22);
    cc4.deposita(222.0);

    List<Conta> lista = new ArrayList<>();
    lista.add(cc1);
    lista.add(cc2);
    lista.add(cc3);
    lista.add(cc4);

    NumeroDaContaComparator comparator = new NumeroDaContaComparator();
    lista.sort(comparator);

    for (Conta conta : lista) {
        System.out.println(conta);
    }

    NumeroDaContaComparator comparator = new NumeroDaContaComparator();
    lista.sort(comparator);

    System.out.println("---------");

    for (Conta conta : lista) {
        System.out.println(conta);
    }
}
*
 */