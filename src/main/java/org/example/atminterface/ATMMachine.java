package org.example.atminterface;


// Create a class to represent the ATM machine. Design the user interface for the ATM, including options such as withdrawing, depositing, and checking the balance. Implement methods for each option, such as withdraw(amount), deposit(amount), and checkBalance().
public interface ATMMachine {
    public double withdraw(double amount);

    public double deposit(double amount);

    public void checkBalance();
}
