package com.jony;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Main class simulating a menu
 *
 * @author Jonatas Dourado
 * @version 0.2
 */

public class Main {
    public static void main(String[] args) {
        // try-with-resources Statement
        try(Connection connection = new Connection() ){
            connection.readData();
            database();
            //login();
            //menu1();
        } catch (IllegalStateException exception) {
            System.err.println(exception);
            System.out.println("Connection error");
        } catch (IOException exception) {
            System.err.println(exception);
            System.out.println("Reading file error");
        }
    }
    static Scanner input = new Scanner(System.in);
    static CheckingAccount checkingAccount;
    static SavingsAccount savingsAccount;
    static SpecialClient specialClient;
    static CommonClient commonClient;
    static LowIncomeClient lowIncomeClient;
    static int opt1;
    static int opt2;
    static double value;
    static int j,i,k,l;
    static ArrayList<Double> bankStatement = new ArrayList<Double>();
    static ArrayList<Integer> bankStatement2 = new ArrayList<Integer>();

    public static int database() throws IOException {
        InputStream dataBase = new FileInputStream("database.txt");
        Reader dataBaseReader = new InputStreamReader(dataBase);
        BufferedReader dataBaseBufferedReader = new BufferedReader(dataBaseReader);

        String line = dataBaseBufferedReader.readLine();
        while (line != null) {
            System.out.println(line);
            line = dataBaseBufferedReader.readLine();
        }

        //OutputStream outputStream = new FileOutputStream("database.txt");
        //Writer dataBaseWriter = new OutputStreamWriter(outputStream);
        //BufferedWriter dataBaseBufferedWriter = new BufferedWriter(dataBaseWriter);

        //BufferedWriter dataBaseBufferedWriter = new BufferedWriter(new FileWriter("database.txt"));
        
        //PrintStream dataBasePrintStream = new PrintStream(new File("database.txt"));
        
        PrintWriter dataBasePrintWriter = new PrintWriter("database.txt");
        dataBasePrintWriter.println("Teste1");
        dataBasePrintWriter.println();
        dataBasePrintWriter.print("Teste2");

        dataBaseBufferedReader.close();
        dataBasePrintWriter.close();

        specialClient  = new SpecialClient();
        specialClient.setName("階戸瑠李");
        specialClient.setCpf("01234567899");
        specialClient.setSex('f');
        //specialClient.setBirth("10/30/1988");
        specialClient.setAddress("touri", "123", null, "machi", "Tokyo", "60050100");
        specialClient.setPassword(1234);
        checkingAccount = new CheckingAccount(specialClient, 3124, 223334, 1000);
        specialClient.setCheckingAccount(checkingAccount);

        lowIncomeClient  = new LowIncomeClient();
        lowIncomeClient.setName("Jonatas Fontele");
        lowIncomeClient.setCpf("01234567898");
        lowIncomeClient.setSex('m');
        //lowIncomeClient.setBirth("06/10/1988");
        lowIncomeClient.setAddress("rua", "111", "407", "bairro", "Fortaleza", "60050101");
        lowIncomeClient.setPassword(4321);
        savingsAccount = new SavingsAccount(lowIncomeClient, 1234, 44332, 0.10);
        lowIncomeClient.setSavingsAccount(savingsAccount);
        return 0;
    }

    public static int login() {
        for(int trial = 0; trial <= 5; trial++){
            try{
                //InternalSystem internalSystem = new InternalSystem();
                //internalSystem.authenticate();
                System.out.println("Account number: ");
                int accountNumberInput = input.nextInt();
                System.out.println("Password: ");
                int passwordInput = input.nextInt();
                if(accountNumberInput != specialClient.getCheckingAccount().getAccountNumber() && specialClient.authenticate(passwordInput))
                    opt2 = 1;
                else if(accountNumberInput != commonClient.getCheckingAccount().getAccountNumber() && commonClient.authenticate(passwordInput))
                    opt2= 2;
                else if(accountNumberInput != lowIncomeClient.getCheckingAccount().getAccountNumber() && lowIncomeClient.authenticate(passwordInput))
                    opt2 =3;
                else{
                    System.out.println("Agência ou Senha incorreto.");
                    return login();
                }
                return 0;
            }catch (InputMismatchException | NumberFormatException exception) {
                System.err.println(exception);
                System.out.println("Incompatibilidade de entrada.");
            }finally {
                input.close();
            }
        }
        return 0;
    }
    // Good performance running large loop and used for read a string of numbers.
    public static int readInput() throws NumberFormatException {
        Scanner s = new Scanner(System.in);
        return Integer.parseInt(s.nextLine());
    }

    public static int menu1() {
        int menu;
        System.out.println("Você tem "+ checkingAccount.getBalance()+" reais na Conta Corrente.");
        System.out.println("Você tem "+ savingsAccount.getBalance()+" reais na Conta Poupança.");
        System.out.println("Qual o tipo da conta?");
        System.out.println("1 - Corrente");
        System.out.println("2 - Poupança");
        System.out.println("3 - Sair");
        System.out.println("Digite um opção: ");
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
        /*System.out.println("Nome: " + acc1.client.getName());
        System.out.println("Conta: " + acc1.getAccountNumber());
        System.out.println("Saldo: " + acc1.getBalance());

        acc1.depositValue(20);
        try {
            acc1.withdrawValue(20.50);
        } catch(InsufficientBalanceException exception){
            System.out.println(exception.getMessage());
        }*/

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
                    checkingAccount.accountsLoan(value);
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

                    //checkingAccount.withdrawValue(value);
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
                    //savingsAccount.withdrawValue(value);
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
}
