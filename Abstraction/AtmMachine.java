package Abstraction;
import java.util.Scanner;

abstract class ATM {
    double balance = 0;

    abstract void withdraw(double amount);
    abstract void deposit(double amount);

    void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    void welcomeMessage() {
        System.out.println("Welcome to SBI ATM");
    }
}

class SBIAtm extends ATM {

    public SBIAtm(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("₹" + amount + " deposited successfully.");
    }
}

public class AtmMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SBIAtm atm = new SBIAtm(10000);

        atm.welcomeMessage();

        while (true) {
            System.out.println("\n===== ATM Menu =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double dep = sc.nextDouble();
                    atm.deposit(dep);
                    break;
                case 3:
                    System.out.print("Enter withdraw amount: ");
                    double wd = sc.nextDouble();
                    atm.withdraw(wd);
                    break;
                case 4:
                    System.out.println("Thank you for using ATM.");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}


