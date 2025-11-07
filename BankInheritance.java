

import java.util.Scanner;

// Base Class
class Account {
    String name;
    String accNo;
    double balance;

    void inputDetails(Scanner sc) {
        System.out.print("Enter A/C No.: ");
        accNo = sc.next();
        System.out.print("Enter Customer Name: ");
        name = sc.next();
    }

    void displayInfo(String type) {
        System.out.println("--------------- Account Info ------------------");
        System.out.println("Name: " + name);
        System.out.println("A/C No: " + accNo);
        System.out.println("Type of Account: " + type);
        System.out.println("Available Balance: " + balance);
        System.out.println("------------------------------------------------");
    }

    void deposit(Scanner sc) {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        balance += amount;
        System.out.println("Amount deposited successfully.");
        System.out.println("Available Balance: " + balance);
    }

    void withdraw(Scanner sc, double minBalance) {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        if (balance - amount >= minBalance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance! Minimum balance should be " + minBalance);
        }
        System.out.println("Available Balance: " + balance);
    }
}

// Derived Class 1 for Saving Account 
class SavingsAccount extends Account {
    SavingsAccount(Scanner sc) {
        inputDetails(sc);
        do {
            System.out.print("Enter Initial balance (must be >= 1000): ");
            balance = sc.nextDouble();
        } while (balance < 1000);
    }

    void menu(Scanner sc) {
        int choice;
        do {
            System.out.println("\n------ Operation ------");
            System.out.println("1. Withdrawal");
            System.out.println("2. Deposit");
            System.out.println("3. A/C info");
            System.out.println("4. Balance info");
            System.out.print("Select any one: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 : 
                 withdraw(sc, 1000);
                   break;
                case 2 : deposit(sc);
                break;
                case 3 : displayInfo("Savings Account");
                break;
                case 4 :System.out.println("Available Balance: " + balance);
                break;
                default : System.out.println("Invalid option!");
            }
            System.out.print("Press 0 to exit or any other number to continue in Savings Account: ");
        } while (sc.nextInt() != 0);
    }
}

// Derived Class 2 for Current account
class CurrentAccount extends Account {
    CurrentAccount(Scanner sc) {
        inputDetails(sc);
        do {
            System.out.print("Enter Initial balance (must be >= 5000): ");
            balance = sc.nextDouble();
        } while (balance < 5000);
    }

    void menu(Scanner sc) {
        int choice;
        do {
            System.out.println("\n------ Operation ------");
            System.out.println("1. Withdrawal");
            System.out.println("2. Deposit");
            System.out.println("3. A/C info");
            System.out.println("4. Balance info");
            System.out.print("Select any one: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> withdraw(sc, 5000);
                case 2 -> deposit(sc);
                case 3 -> displayInfo("Current Account");
                case 4 -> System.out.println("Available Balance: " + balance);
                default -> System.out.println("Invalid option!");
            }
            System.out.print("Press 0 to exit or any other number to continue in Current Account: ");
        } while (sc.nextInt() != 0);
    }
}

// Main Class
public class BankInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("\n----------- Select Account -----------");
            System.out.println("1. Savings Account");
            System.out.println("2. Current Account");
            System.out.print("Select any one: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                SavingsAccount sa = new SavingsAccount(sc);
                sa.menu(sc);
            } else if (choice == 2) {
                CurrentAccount ca = new CurrentAccount(sc);
                ca.menu(sc);
            } else {
                System.out.println("Invalid Choice!");
            }
            System.out.print("\nPress 0 to exit from account or any other number to continue account operation: ");
            ch = sc.nextInt();
        } while (ch != 0);

        System.out.println("\nThank you for banking with us!");
        sc.close();
    }
}