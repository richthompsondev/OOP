package com.jony;

public class Account {
    Client client = new Client();
    private int accountNumber;
    private double balance;
    private double limit;
    private double loanTotal;

    //Constructor
    public Account(String name, int accountNumber, double balance) {
        this.client.setName(name);
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getLoanTotal() {
        return loanTotal;
    }

    public void setLoanTotal(double loanTotal) {
        this.loanTotal = loanTotal;
    }

    synchronized boolean depositValue(double value) {
        this.balance += value;
        return true;
    }


    synchronized boolean withdrawValue(double value) {
        if (this.balance >= value) {
            this.balance -= value;
            return true;
        }
        System.out.println("Erro. Saldo insuficiente.");
        // IllegalArgumentException error = new IllegalArgumentException()
        // throw error
        return false;
    }


    synchronized boolean transferValue(Account destination, double value) {
        if (this.withdrawValue(value)) {
            destination.depositValue(value);
            return true;
        }
        System.out.println("Erro. Saldo insuficiente para transferencia.");
        return false;
    }

    public void accountsLoan(int value) {
        int loanTotal = value;
        this.loanTotal = this.loanTotal + loanTotal;
        balance = balance + value;
    }

    void informBalance() {

    }

    void informAccType() {

    }
}
/*
public class Banco {
     public synchronized boolean transfere
onta c1, Conta c2, float valor) {
        if (saque(c1, valor)){
            if (deposito(c2, valor)){
               return(true);
            }else{
               deposito(c1,valor);
            }
       }
    }

    public synchronized boolean saque(Conta conta, float valor) {
       if (valor <= conta.getSaldo() && conta.valida()) {
             conta.debito(valor);
             return (true);
        }
        return (false);
    }

    public synchronized boolean deposito(Conta conta, float valor) {
        if (conta.valida()) {
             conta.credito(valor);
             return (true);
        }
        return (false);
    }
}

*
*
01. import java.util.Scanner;
02. public class AparelhoDeSom {
03.     private static Scanner scanner;
04.     private static final int minVol = 0, maxVol = 100;
05.     private int volume;
06.
07.     public AparelhoDeSom() {
08.         scanner = new Scanner(System.in);
09.     }
10.
11.     private void definirVolume() throws VolumeException {
12.         System.out.print("Digite o valor do volume: ");
13.         int volume = scanner.nextInt();
14.         if(volume < minVol || volume > maxVol)
15.             throw new VolumeException(volume);
16.
17.             this.volume = volume;
18.     }
19. }

01. public class VolumeExcepetion extends Excepetion {
02.     private int valor;
03.
04.     public VolumeExcepetion(int valor) {
05.         this.valor = valor;
06.     }
07.
08.     public String getMessage() {
09.         return "O valor" + valor + "n�o est� dentro do limite aceit�vel para volume.";
10.     }
11. }

public static void lerTeclado() throws InvalidAttributeValueException {
    Scanner s = new Scanner(System.in);
    String texto = s.nextLine();
    if(texto.isEmpty()) // Testa se o texto � vazio
        throw new InvalidAttributeValueException();
}
*/
