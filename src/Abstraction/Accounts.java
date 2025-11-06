package Abstraction;

import java.util.*;

abstract class Pay {
    int balance = 0;
    List<String> transactions = new ArrayList<>();

    abstract void credit(int amount);
    abstract void debit(int amount);

    public void showMiniStatement() {
        System.out.println("Mini Statement:");
        for (String t : transactions) {
            System.out.println(t);
        }
        System.out.println("Current Balance: ₹" + balance);
        System.out.println("-----------------------------");
    }
}
class SavingsAccount extends Pay {

    @Override
    void credit(int amount) {
        balance += amount;
        transactions.add("Credited ₹" + amount);
        System.out.println("Credited ₹" + amount + " to Savings Account");
    }

    @Override
    void debit(int amount) {
        if (balance >= amount) {
            balance -= amount;
            transactions.add("Debited ₹" + amount);
            System.out.println("Debited ₹" + amount + " from Savings Account");
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}
public class Accounts {
    public static void main(String[] args) {
        Pay user1 = new SavingsAccount();

        user1.credit(1000);
        user1.debit(300);
        user1.showMiniStatement();
        
    }
}
