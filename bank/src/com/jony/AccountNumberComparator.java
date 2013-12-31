package com.jony;

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

    lista.sort(new NumeroDaContaComparator());

    for (Conta conta : lista) {
        System.out.println(conta);
    }

    // Classe anônima - tira a necessidade de criar AccountNumberComparator
    lista.sort(new Comparator<Account>() {
        @Override
        public int compare(Account a1, Account a2) {
            return Integer.compare(a1.getAccountNumber(), a2.getAccountNumber());
        }
    });
    * //Função lambda
    * // Interface lista já sabe que a1 e a2 são do tipo Account
    * lista.sort((a1, a2) -> Integer.compare(a1.getAccountNumber(), a2.getAccountNumber()));
    *

    System.out.println("---------");

    for (Conta conta : lista) {
        System.out.println(conta);
    }
    * lista.forEach((conta) -> System.out.println(conta));
}
*
 */