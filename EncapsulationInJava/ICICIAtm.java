package EncapsulationInJava;

import java.util.Scanner;

interface Atm {
    void withdraw(double amount) throws Exception;
    void deposit(double amount) throws Exception;
}

public class ICICIAtm implements Atm {
    private String name;
    private String accountNumber;
    private String address;
    private double balance;

    // Constructor to initialize values
    public ICICIAtm(String name, String accountNumber, String address, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.address = address;
        this.balance = balance;
    }

    // Method to withdraw money
    @Override
    public void withdraw(double amount) throws Exception {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew ₹" + amount);
            System.out.println("Your current balance is ₹" + balance);
        } else {
            //System.out.println("Insufficient balance in your account.");
        	throw new Exception("Insufficient Balance");
        }
    }

    // Method to deposit money
    @Override
    public void deposit(double amount) throws Exception {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited ₹" + amount);
            System.out.println("Your current balance is ₹" + balance);
        } else {
            throw new Exception("Insufficient Balance");
        }
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ICICIAtm i = new ICICIAtm("Sushant Shinde", "123456", "Kolhapur", 10000.00);
        Atm a = i;
        int ch;
        double amount;

        do {
            System.out.println("\nWelcome to our application");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Your balance is ₹" + i.getBalance());
                    break;

                case 2:
                    System.out.print("Enter the amount: ");
                    amount = sc.nextDouble();
				try {
					a.deposit(amount);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                    break;

                case 3:
                    System.out.print("Enter the amount: ");
                    amount = sc.nextDouble();
				try {
					a.withdraw(amount);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                    break;

                case 4:
                    System.out.println("Thank you for using ICICI ATM. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (ch != 4);

        sc.close();
    }
}
