package Encapsulation;

import java.util.*;

class DigitalWallet {
    private double balance;
    private List<String> transactions;

    public DigitalWallet() {
        balance = 0.0;
        transactions = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    private void setBalance(double amt) {
        balance = amt;
    }
    public List<String> getTransactions() {
        return new ArrayList<>(transactions);
    }

    public void addFunds(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Cannot add.");
            return;
        }
        setBalance(balance + amount);
        record("Added " + amount);
    }

    public void makePayment(double amount) {
        if (amount <= 0) {
            System.out.println("Payment must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("Payment failed: Insufficient balance.");
            return;
        }
        setBalance(balance - amount);
        record("Paid " + amount);
    }

    private void record(String entry) {
        transactions.add(entry + " | Balance: " + balance);
    }
}

public class WalletDemo {
    public static void main(String[] args) {

        DigitalWallet wallet = new DigitalWallet();

        wallet.addFunds(500);
        wallet.makePayment(200);
        wallet.makePayment(400); 

        System.out.println("Final Balance: " + wallet.getBalance());
        System.out.println("Transactions: " + wallet.getTransactions());
    }
}

