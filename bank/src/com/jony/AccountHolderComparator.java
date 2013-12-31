package com.jony;

import java.util.Comparator;

/**
 * Class for String sorting
 *
 * @author Jonatas Dourado
 * @version 0.1
 */

public class AccountHolderComparator implements Comparator<Account> {

    @Override
    public int compare(Account a1, Account a2) {
        String a1Name = a1.getHolderName().getName();
        String a2Name = a2.getHolderName().getName();
        return a1Name.compareTo(a2Name);
    }
}

/*
*
public class Test {
    Conta cc1 = new ContaCorrente(22, 33);
    Cliente clienteCC1 = new Cliente();
    clienteCC1.setNome("Nico");
    cc1.setTitular(clienteCC1);
    cc1.deposita(333.0);

    Conta cc2 = new ContaPoupanca(22, 44);
    Cliente clienteCC2 = new Cliente();
    clienteCC2.setNome("Guilherme");
    cc2.setTitular(clienteCC2);
    cc2.deposita(444.0);

    Conta cc3 = new ContaCorrente(22, 11);
    Cliente clienteCC3 = new Cliente();
    clienteCC3.setNome("Paulo");
    cc3.setTitular(clienteCC3);
    cc3.deposita(111.0);

    Conta cc4 = new ContaPoupanca(22, 22);
    Cliente clienteCC4 = new Cliente();
    clienteCC4.setNome("Ana");
    cc4.setTitular(clienteCC4);
    cc4.deposita(222.0);

    // Classe anônima
    Comparator<Account> comp = new Comparator<Account>() {
        @Override
        public int compare(Account a1, Account a2) {
            String a1Name = a1.getHolderName().getName();
            String a2Name = a2.getHolderName().getName();
            return a1Name.compareTo(a2Name);
        }
    }
    * //Função lambda
    * Comparator<Account> comp = (Account a1, Account a2) -> {
    *       String a1Name = a1.getHolderName().getName();
    *       String a2Name = a2.getHolderName().getName();
    *       return a1Name.compareTo(a2Name);
    *   };
    *

    lista.sort(comp);

    for (Conta conta : lista) {
        System.out.println(conta + ", " + conta.getTitular().getNome());
    }

    Collections.sort(lista, new TitularDaContaComparator()); //Ordenando com collections
    Collections.sort(lista); //Ordenando sem comparator, porém implementando comparable
    Collections.reverse(lista);
    Collections.shuffle(lista);
    Collections.rotate(lista, 5); //rotacionar 5 posições
}
*
 */