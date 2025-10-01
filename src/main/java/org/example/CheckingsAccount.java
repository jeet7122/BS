package org.example;

public class CheckingsAccount extends Account {
    @Override
    public void withdraw(double amount) {
        if (getBalance() <=0 && ((getBalance() - amount) > -500)){
            setBalance(getBalance() - amount);
        }
        else if(getBalance() <=0 && ((getBalance() - amount) < -500)){
            System.out.println("Even Exceeds Overdraft limit");
        }
        else {
            setBalance(getBalance() - amount);
        }

    }

    @Override
    public void applyMonthlyFeatures() {
        setBalance(getBalance() - (getBalance() * 0.005));
    }
}
