package lab01;

public class Transaction {
    private java.util.Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Transaction(){
        date = new java.util.Date();
    }

    public Transaction(char type, double amount, double balance, String description){
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        date = new java.util.Date();
    }

    @Override
    public String toString() {
        return String.format("Date: %s | Type: %c | Amount: %.2f | Balance: %.2f | Description: %s",
        date, type, amount, balance, description);
    }
}
