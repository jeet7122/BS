package org.example;

public abstract class Account {
    private String accountNumber;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        setBalance(getBalance() + amount);
        System.out.println("Deposit of " +amount + " $ rounds your balance "+ getBalance());
    }
    public void displayInfo(){
        System.out.printf("""
                Account number: %s
                Balance:$ %.2f
                """, getAccountNumber(), getBalance());
    }
    public abstract void withdraw(double amount);
    public abstract void applyMonthlyFeatures();
}
