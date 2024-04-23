package org.example;


import org.example.atminterface.BankAccount;

public class Main {

    public static void main(String[] args) {
//        NumberGame numberGame = new NumberGame(0);
//        numberGame.startGame();

//        StudentGradeCalculator calculator = new StudentGradeCalculator();
//        calculator.getGradesArray();

        BankAccount bankAccount = new BankAccount(0);
        bankAccount.deposit(947);
        bankAccount.checkBalance();
        bankAccount.withdraw(500);
        bankAccount.checkBalance();

    }
}