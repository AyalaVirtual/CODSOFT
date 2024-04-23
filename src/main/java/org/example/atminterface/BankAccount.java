package org.example.atminterface;

public class BankAccount implements ATMMachine {
    private double balance = 0;


    public BankAccount(double balance) {
        this.balance = balance;
    }


    @Override
    public double withdraw(double amount) {

    }

    @Override
    public double deposit(double amount) {

    }

    @Override
    public void checkBalance() {

    }
}
