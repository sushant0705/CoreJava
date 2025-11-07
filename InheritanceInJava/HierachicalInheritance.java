package InheritanceInJava;

public class HierachicalInheritance { // Bank class
    String bankName;
    String accountHolderName;
    String accountNumber;

    public HierachicalInheritance(String bankName, String accountHolderName, String accountNumber) {
        this.bankName = bankName;
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }

    void showDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
    }
}

class Saving extends HierachicalInheritance {
    double amount;

    public Saving(String bankName, String accountHolderName, String accountNumber, double amount) {
        super(bankName, accountHolderName, accountNumber);
        this.amount = amount;
    }

    void withdrawLimit(double amount) {
        if (amount >= 100000) {
            System.out.println("Amount exceeds withdrawal limit for Saving Account.");
        } else {
            System.out.println("Withdrawal successful: ₹" + amount);
        }
    }
}

class Current extends HierachicalInheritance {
    double amount;

    public Current(String bankName, String accountHolderName, String accountNumber, double amount) {
        super(bankName, accountHolderName, accountNumber);
        this.amount = amount;
    }

    void depositLimit(double amount) {
        if (amount <= 100000) {
            System.out.println("Deposit amount too low for Current Account.");
        } else {
            System.out.println("Deposit successful: ₹" + amount);
        }
    }
}
