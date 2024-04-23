package org.example.atminterface;


// Create a class to represent the user's bank account, which stores the account balance. Connect the ATM class with the user's bank account class to access and modify the account balance.
public class BankAccount implements ATMMachine {
    private double balance = 0;


    public BankAccount(double balance) {
        this.balance = balance;
    }


    @Override
    public double withdraw(double amount) {
        // Validate user input to ensure it is within acceptable limits (e.g., sufficient balance for withdrawals). Display appropriate messages to the user based on their chosen options and the success or failure of their transactions.
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful! Your new balance is " + balance);
        } else {
            System.out.println("Withdrawal failed! Your new balance is " + balance);
        }

        return balance;
    }

    @Override
    public double deposit(double amount) {
        balance += amount;
        // Display appropriate messages to the user based on their chosen options and the success or failure of their transactions.
        System.out.println("Deposit successful! Your new balance is " + balance);
    }

    @Override
    public void checkBalance() {

        // Display appropriate messages to the user based on their chosen options and the success or failure of their transactions.

    }
}
