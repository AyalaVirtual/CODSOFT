package org.example.atminterface;

public interface ATMMachine {
    public int withdraw(int amount);

    public int deposit(int amount);

    public void checkBalance();
}
