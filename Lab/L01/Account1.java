package lab01;

import java.util.ArrayList;
import java.util.Date;

public class Account1 {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private String name;
    private java.util.Date dateCreated;
    private ArrayList<Transaction> transactions;

   // No-arg constructor
    public Account1(){
        dateCreated = new java.util.Date();
    }

    // Constructor that creates an account with specified id and initial balance
    public Account1(int id, double balance, String name){
        this.id = id;
        this.balance = balance;
        this.name = name;
        dateCreated = new java.util.Date();
        this.transactions = new ArrayList<>();
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

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setName(String name) {
        this.name = name;
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
        if (balance < amount){
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            transactions.add(new Transaction('w', amount, balance, "Withdrawal"));
        }
    }

    public void deposit(double amount){
        balance += amount;
        transactions.add(new Transaction('d', amount, balance, "Deposit"));
    }

    public void accountSummary() {
        System.out.println("Account");
        System.out.println("Account ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Interest Rate: " + getMontlyInterestRate());
        System.out.println("Balance: " + balance);
        for (int i = 0; i < transactions.size(); i++){
            System.out.println(transactions.get(i));
        }
    }
}
