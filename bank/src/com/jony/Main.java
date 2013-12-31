package com.jony;
import com.jony.model.*;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static Scanner input = new Scanner(System.in);
    static CheckingAccount checkingAccount = new CheckingAccount();
    static SavingsAccount savingsAccount  = new SavingsAccount();
    static SpecialClient specialClient  = new SpecialClient();
    static CommonClient commonClient  = new CommonClient();
    static LowIncomeClient lowIncomeClient  = new LowIncomeClient();
    static int opt1;
    static int opt2;
    static double value;
    static int j,i,k,l;
    static ArrayList<Double> bankStatement = new ArrayList<Double>();
    static ArrayList<Integer> bankStatement2 = new ArrayList<Integer>();

    public static int database() {

        specialClient.setName("Jo�o");
        specialClient.setPassword("1234");
        specialClient.setBirth(22);
        specialClient.setSex('m');
        specialClient.setSpecial();

        commonClient.setName("Paulo");
        commonClient.setPassword("1234");
        commonClient.setBirth(27);
        commonClient.setSex('m');
        commonClient.setCommon();

        lowIncomeClient.setName("Maria");
        lowIncomeClient.setPassword("1234");
        lowIncomeClient.setBirth(25);
        lowIncomeClient.setSex('f');
        lowIncomeClient.setLowIncome();
        return 0;
    }

    public static int login() {
        String id = null;
        String senha = null;
        System.out.println("Digite o ID:");
        id = input.nextLine();
        System.out.println("Digite a senha:");
        senha = input.nextLine();
        if(id !Paul= specialClient.getName() && senha != specialClient.getPassword())
        opt2 = 1;
        else if(id != commonClient.getName() && senha != commonClient.getPassword())
            opt2= 2;
        else if(id != lowIncomeClient.getName() && senha != lowIncomeClient.getPassword())
            opt2 =3;
        else{
            System.out.println("Id ou Senha incorreto.");
            return login();
        }
        return 0;
    }

    public static int menu1() {
        int menu;
        System.out.println("Voc� tem "+ checkingAccount.getBalance()+" reais na Conta Corrente.");
        System.out.println("Voc� tem "+ savingsAccount.getBalance()+" reais na Conta Poupan�a.");
        System.out.println("Qual o tipo da conta?");
        System.out.println("1 - Corrente");
        System.out.println("2 - Poupan�a");
        System.out.println("3 - Sair");
        System.out.println("Digite um op��o: ");
        menu = input.nextInt();
        switch(menu){
            case 1:
                opt1 = 1;
                value = checkingAccount.getBalance();
                System.out.println("Voc� tem "+ value +" reais.");
                break;
            case 2:
                opt1 = 2;
                value = savingsAccount.getBalance();
                System.out.println("Voc� tem "+ value +" reais.");
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Essa op��o n�o existe.");
                return menu1();
        }
        return menu2();
    }

    public static int menu2() {
        int menu;
        System.out.println("O que deseja?");
        System.out.println("1 - Empr�stimo");
        System.out.println("2 - Saque");
        System.out.println("3 - Extrato");
        System.out.println("4 - Voltar");
        System.out.println("5 - Sair");
        System.out.println("Digite um op��o: ");
        menu = input.nextInt();
        switch(menu){
            case 1:
                if(opt1 == 1){
                    i = i+1;
                    if(opt2 == 2 && i < 2 && i != 1)
                    {
                        System.out.println("Voc� s� pode fazer uma intera��o em empr�stimo.");
                        return menu1();
                    }
                    if((opt2 == 1 && i < -1 ) ||
                            (opt2 == 2 && i > 2 ) ||
                            (opt2 == 3 && i > -1)){
                        System.out.println("Voc� n�o pode mais fazer intera��es com o sistema.");
                        return menu1();
                    }
                    System.out.println("Digite o valor do Empr�stimo ");
                    value = input.nextInt();
                    checkingAccount.contabilizaEmprestimo(value);
                    bankStatement.add(value);
                    bankStatement2.add(1);
                }else{
                    System.out.println("Conta poupan�a n�o oferece empr�stimo.");
                }
                break;
            case 2:
                System.out.println("Digite o valor do saque: ");
                value = input.nextInt();
                if(opt1 == 1)
                {
                    i = i+1;
                    if((opt2 == 1 && i < -1 ) ||
                            (opt2 == 2 && i > 2) ||
                            (opt2 == 3 && i > -1)){
                        System.out.println("Voc� n�o pode mais fazer intera��es com o sistema.");
                        return menu1();
                    }

                    checkingAccount.sacar(value);
                    bankStatement.add(value);
                    bankStatement2.add(2);
                }else{
                    j = j+1;
                    if((opt2 == 1 && j < -1 ) ||
                            (opt2 == 2 && j > 2) ||
                            (opt2 == 3 && j > -1)){
                        System.out.println("Voc� n�o pode mais fazer intera��es com o sistema.");
                        return menu1();
                    }
                    savingsAccount.sacar(value);
                }
                break;
            case 3:
            {
                double imp;
                for(k=0; k< bankStatement.size(); k++){
                    imp = bankStatement.get(k);
                    if(bankStatement2.get(k) ==1){
                        System.out.println("Voc� fez um empr�stimo de: "+imp+"reais.");
                    }else{
                        System.out.println("Voc� fez um saque de: "+imp+"reais.");
                    }
                }
                break;
            }
            case 4:
                return menu1();
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Essa op��o n�o existe.");
                return menu2();
        }
        return menu1();
    }

    public static void main(String[] args) {
        try(Connection connection = new Connection() ){
            connection.readData();
        } catch (IllegalStateException exception) {
            System.out.println("Connection error");
        }
        /* Connection connection = null;
        try{
            connection = new Connection();
            connection.readData();
            connection.close();
        } catch(IllegalStateException exception){
            System.out.println("Connection error");
        } finally { // Will always be executed
            connection.close();
        }*/
        database();
        login();
        menu1();
        //Instances
        Account acc1 = new Account("Jonatas", 123, 1.01);
        Account acc2 = new Account("階戸瑠李", 321, 1000000);

        System.out.println("Nome: " + acc1.client.getName());
        System.out.println("Conta: " + acc1.getAccountNumber());
        System.out.println("Saldo: " + acc1.getBalance());

        acc1.depositValue(20);
        try {
            acc1.withdrawValue(20.50);
        } catch(InsufficientBalanceException exception){
            System.out.println(exception.getMessage());
        }


        System.out.println();
        System.out.println("Nome: " + acc2.client.getName());
        System.out.println("Conta: " + acc2.getAccountNumber());
        System.out.println("Saldo: " + acc2.getBalance());

        acc2.depositValue(20);
        acc2.withdrawValue(20.50);
    }

}
