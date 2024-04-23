package org.example.atminterface;

public interface ATMMachine {
    public double withdraw(double amount);

    public double deposit(double amount);

    public void checkBalance();
}
