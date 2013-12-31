package com.jony;

public abstract class Account implements Authentication{
    Client client;
    private int accountNumber;
    private double balance;
    private double limit;
    private double loanTotal;
    private static int accountsTotal;
    private AuthenticationUtil authenticator;

    // Constructors
    public Account(String name, int accountNumber, double balance, double limit) {
        this.client = new Client(); //assuming each new account creates a new client
        this.client.setName(name);
        this.accountNumber = accountNumber;
        if(balance >= 0){
            this.balance = balance;
        }else{
            System.out.println("O saldo não pode ser negativo. Saldo zerado.");
            this.balance = 0;
        }
        //this.balance = balance;
        Account.accountsTotal++;
    }

    public Account(String name, int accountNumber, double balance) {
        // Initial limit = 1000 just for example
        this(name, accountNumber, balance, 1000);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public double getLoanTotal() {
        return loanTotal;
    }

    public void setLoanTotal(double loanTotal) {
        this.loanTotal = loanTotal;
    }

    synchronized boolean depositValue(double value) {
        this.balance += value;
        System.out.println("Depósito realizado. Saldo atual: " + this.balance);
        return true;
    }

    synchronized boolean withdrawValue(double value) {
        if (this.balance >= value) {
            this.balance -= value;
            System.out.println("Saque realizado. Saldo atual: " + this.balance);
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
        System.out.println("Erro. Saldo insuficiente para transferência.");
        return false;
    }

    synchronized boolean accountsLoan(double value) {
        if(this.loanTotal <= value){
            double loanTotal = value;
            this.loanTotal = this.loanTotal + loanTotal;
            balance = balance + value;
            System.out.println("Empréstimo realizado. Saldo atual: " + this.balance);
            return true;
        }
        System.out.println("Erro. Valor do empréstimo acima do permitido.");
        return false;
    }

    void informBalance() {

    }

    void informAccType() {

    }

    @Override
    public void setPassword(int password) {
        this.authenticator.setPassword(password);
    }

    @Override
    public boolean authenticate(int password) {
        return this.authenticator.authenticate(password);
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
