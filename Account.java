import java.util.ArrayList;

public class Account {
    private String accountHolder;
    private String accountNumber;
    private double balance;
    private ArrayList<String> transactionHistory;

    public Account(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Account created with balance: ₹" + initialBalance);
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited ₹" + amount + " | Balance: ₹" + balance);
            System.out.println("✅ Deposited ₹" + amount + " successfully!");
        } else {
            System.out.println("❌ Deposit amount must be positive!");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrew ₹" + amount + " | Balance: ₹" + balance);
            System.out.println("✅ Withdrawn ₹" + amount + " successfully!");
        } else if (amount > balance) {
            System.out.println("❌ Insufficient funds!");
        } else {
            System.out.println("❌ Withdrawal amount must be positive!");
        }
    }

    // Show transaction history
    public void showTransactionHistory() {
        System.out.println("\n📜 Transaction History for " + accountHolder + ":");
        for (String record : transactionHistory) {
            System.out.println("- " + record);
        }
    }
}
