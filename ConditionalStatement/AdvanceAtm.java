
package ConditionalStatement;

import java.util.Scanner;

public class AdvanceAtm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin;
        double amount;
        boolean isValid = false;

        
        boolean pinCorrect = false;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter your PIN: ");
            pin = sc.nextInt();

            if (pin == 1234) {
                pinCorrect = true;
            } else {
                System.out.println("Incorrect PIN. Attempts left");
            }
        }

        
        if (pinCorrect) {
            do {
                System.out.print("Enter amount (less than 10000): ");
                amount = sc.nextDouble();

                if (amount > 0 && amount < 10000) {
                    System.out.println("Transaction successful. Amount withdrawn: ₹" + amount);
                    isValid = true;
                } else {
                    System.out.println("Invalid amount. Try again.");
                }
            } while (!isValid);
        } else {
            System.out.println("3 wrong attempts.");
        }

        
    }
}

