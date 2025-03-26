package lab01;

import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private java.util.Date dateCreated;

    // No-arg constructor
    public Account(){
        dateCreated = new java.util.Date();
    }

    // Constructor that creates an account with specified id and initial balance
    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        dateCreated = new java.util.Date();
    } 

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    
    // Method to return monthly interest rate
    public double getMontlyInterestRate() {
        return (annualInterestRate / 100) / 12;
    }

    // Method to return monthly interest
    public double getMontlyInterest() {
        return balance * getMontlyInterestRate();
    }

    public void withdraw(double amount){
        if (amount > balance){
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
        }
    }

    public void deposit(double amount){
        balance += amount;
    }
}
