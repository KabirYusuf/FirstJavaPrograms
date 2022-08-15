package classExercise.Bank;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Main bank = new Main();


        int selection = 0;

        while (selection != -1){

            System.out.println("""
                    Enter 1 to create an Account
                    Enter 2 for deposit
                    Enter 3 for withdrawal
                    Enter 4 to check balance
                    Enter -1 to quit""");

            selection = input.nextInt();

            switch (selection) {
                case 1 -> bank.createAccount();
                case 2 -> bank.deposit();
                case 3 -> bank.withdrawal();
                case 4 -> bank.balance();
            }
        }
    }
    Bank bank = new Bank();
    Scanner input = new Scanner(System.in);

    public void createAccount(){
        System.out.println("Enter Account Name: ");
        String name = input.nextLine();
        System.out.print("Enter Account Pin: ");
        String pin = input.nextLine();
        bank.createAccountFor(name,pin);
    }

    public void deposit(){
        System.out.println("Enter Amount: ");
        int amount = input.nextInt();
        input.nextLine();
        System.out.print("Enter Account Number: ");
        String number = input.nextLine();
        bank.deposit(amount,number);
    }

    public void withdrawal(){
        System.out.println("Enter Amount: ");
        int amount = input.nextInt();
        input.nextLine();
        System.out.println("Enter Account Number: ");
        String number = input.nextLine();
        System.out.print("Enter Account Pin: ");
        String pin = input.nextLine();
        bank.withdrawal(amount, number, pin);
    }

    public void balance(){
        System.out.println("Enter Account Number: ");
        String number = input.nextLine();
        System.out.print("Enter Account Pin: ");
        String pin = input.nextLine();
        bank.balance(number, pin);
    }
}
