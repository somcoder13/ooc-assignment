package assignment;

import java.util.Scanner;

public class BankAccount {

	String accountHolderName;
    int accountNumber;
    double balance;

    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount);
        } else {
            System.out.println("Invalid amount. Please deposit a positive amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account holder's name: ");
        String accountHolderName = scanner.nextLine();

        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();

        BankAccount account = new BankAccount(accountHolderName, accountNumber);

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        account.balance = initialBalance;

        System.out.println("\nAccount created successfully!");
        account.displayAccountInfo();

        System.out.print("\nEnter the amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        System.out.print("\nEnter the amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);

        System.out.println("\nUpdated Account Information:");
        account.displayAccountInfo();

        scanner.close();
    }
}




