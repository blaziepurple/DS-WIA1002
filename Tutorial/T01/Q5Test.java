public class Q5Test {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        System.out.println(account.getBalance());

        System.out.println("\nDepositing 100 into the bank account.");
        account.deposit(100);
        System.out.println(account.getBalance());

        System.out.println("\nAttempting to withdraw 100 from the bank account.");
        account.withdraw(100);
        System.out.println(account.getBalance());

        System.out.println("\nAttempting to withdraw 1500 from the bank account.");
        account.withdraw(1500);
        System.out.println(account.getBalance());
    }
}
