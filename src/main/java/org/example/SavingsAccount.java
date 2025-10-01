package org.example;

public class SavingsAccount extends Account{
    @Override
    public void withdraw(double amount) {
        if (getBalance() <= 100){
            System.out.println("Sorry can not withdraw amount, you have minimum balance in account");
        }
        else {
            setBalance(getBalance() - amount);
        }

    }

    @Override
    public void applyMonthlyFeatures() {
        setBalance(getBalance() + (getBalance() * 0.025));
    }
}
