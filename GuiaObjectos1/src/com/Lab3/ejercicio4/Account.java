package com.Lab3.ejercicio4;

public class Account {
    private int id;
    private String name;
    private double balance;

    public Account(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void printAccountData() {
        System.out.println("Account: [ID: " + this.id + "] [Name: " + this.name + "] [Balance: $" + this.balance + "]");
    }

    private double addCredit(double amount) {
        setBalance(this.balance + amount);
        return this.balance;
    }

    public void makeCredit(double amount) {
        this.addCredit(amount);
        System.out.println("The transaction was made. New account balance: $" + this.balance);
    }

    private double addDebit(double amount) {
        setBalance(this.balance - amount);
        return this.balance;
    }

    public void makeDebit(double amount) {
        if (this.balance < amount) {
            System.out.println("The transaction can not be made. Not enough balance in account.");
        } else {
            this.addDebit(amount);
            System.out.println("The transaction was made. New account balance: $" + this.balance);
        }
    }

}
