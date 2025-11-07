package InheritanceInJava;

import java.util.Scanner;

public class HirachicalTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bank Name: ");
        String bankName = sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String accountHolderName = sc.nextLine();

        System.out.print("Enter Account Number: ");
        String accountNumber = sc.nextLine(); // Use String instead of double

        System.out.print("Enter Initial Amount: ₹");
        double amount = sc.nextDouble();

        System.out.println("\nChoose Account Type:");
        System.out.println("1. Saving Account");
        System.out.println("2. Current Account");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                Saving savingAcc = new Saving(bankName, accountHolderName, accountNumber, amount);
                savingAcc.showDetails();
                System.out.print("Enter amount to withdraw: ₹");
                double withdrawAmt = sc.nextDouble();
                savingAcc.withdrawLimit(withdrawAmt);
                break;

            case 2:
                Current currentAcc = new Current(bankName, accountHolderName, accountNumber, amount);
                currentAcc.showDetails();
                System.out.print("Enter amount to deposit: ₹");
                double depositAmt = sc.nextDouble();
                currentAcc.depositLimit(depositAmt);
                break;

            default:
                System.out.println("Invalid choice. Please select 1 or 2.");
        }

        sc.close();
    }
}
