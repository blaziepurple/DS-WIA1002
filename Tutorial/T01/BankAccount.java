public class BankAccount implements Account {
    private int balance;

    public BankAccount(int balance){
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public int deposit(int deposit) {
        balance += deposit;
        return balance;
    }

    @Override
    public boolean withdraw(int withdraw) {
        if (withdraw > balance){
            return false;
        } else {
            balance -= withdraw;
            return true;
        }
    }
}
