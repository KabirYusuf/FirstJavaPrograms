package classExercise.Bank;

public class Account {
    private int balance;
    private String name;
    private String pin;
    private String number;

    public Account(String accountNumber, String accountName, String accountPin ){
        pin = accountPin;
        name = accountName;
        number = accountNumber;
    }
    public int getBalance(String pin) {
        if(pin.equals(this.pin))return balance;
        return 0;
    }

    public void deposit(int amount) {
        boolean isValidAmount = amount > 0;
        if(isValidAmount)balance = getBalance(pin) + amount;
    }

    public void withdraw(int amount, String pin) {
        boolean isValidAmount = (balance >= amount) && (amount > 0);
        if (isCorrect(pin) && isValidAmount)
            balance -= amount;
    }

    public void transfer(int amount, String pin, String sourceAccountNumber, String destinationAccountNumber){

        transferFrom(amount, pin, sourceAccountNumber);
        transferTo(amount, destinationAccountNumber);
    }

    public void transferFrom(int amount, String sourceAccountNumber, String pin){
        boolean isValidAmount = (balance >= amount) && (amount > 0);
        if(isCorrect(pin) && isValidAmount)
            balance -= amount;
    }

    public void transferTo(int amount, String destinationAccountNumber){
        boolean isValidAmount = amount > 0;
        if(isValidAmount)
            balance += amount;
    }


    private boolean isCorrect(String pin){
        return pin.equals(this.pin);
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String toString(){
        return name +number + balance + pin;
    }
}
