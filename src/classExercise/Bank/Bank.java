package classExercise.bank;

import java.util.ArrayList;

public class Bank{
    private int numberOfCustomer = 10100;
    ArrayList<Account>accounts = new ArrayList<>();

    public void createAccountFor(String accountName, String pin) {

        accounts.add(new Account((numberOfCustomer+1)+"", accountName,pin));
        System.out.println("your account number is " + (numberOfCustomer+1) + "");
        numberOfCustomer++;
    }

    public int getNumberOfCustomers() {
        return numberOfCustomer;
    }

    public Account findAccount(String accountNumber) {
        for(Account account: accounts){
            if(account.getNumber().equals(accountNumber))
                return account;
        }
        return null;
    }

    public void deposit(int amount, String accountNumber) {
        Account account =  findAccount(accountNumber);
        boolean isAValidAmount = amount > 0;
        if (isAValidAmount){
            account.deposit(amount);
            System.out.printf("Deposit of %d was successful%n%n", amount);
        }
        else {
            System.out.printf("%d is an invalid amount%n", amount);
        }
    }

    public  void withdrawal(int amount, String accountNumber, String pin){
        Account account = findAccount(accountNumber);
        boolean isValidAmount = (account.getBalance(pin) >= amount) && (amount > 0);
        if (isValidAmount){
            account.withdraw(amount, pin);
            System.out.printf("Withdrawal of %d was successful%n%n", amount);
        }
        else if (amount <= 0) {
            System.out.printf("%d is an invalid amount%n", amount);
        }
        else {
            System.out.print("Insufficient balance\n");
        }
    }

    public void transfer(int amount, String pin, String sourceAccountNumber, String destinationAccountNumber){
       Account account = findAccount(sourceAccountNumber);
       account.transferFrom(amount, sourceAccountNumber, pin);
       boolean isValidAmount = account.getBalance(pin) >= amount;
       if(isValidAmount){
           account = findAccount(destinationAccountNumber);
           account.transferTo(amount, destinationAccountNumber);
       }
    }

    public void balance(String accountNumber, String pin){
        Account account = findAccount(accountNumber);
        System.out.printf("Account Name: %s%nAccount Number: %s%nAccount Balance: " +
                "%d%n%n", account.getName(),account.getNumber(),account.getBalance(pin));
    }
}
