package ConditionalStatement;
import java.util.*;

public class TestBankingApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankingApplication app = new BankingApplication("Sushant Shinde", 1000.0, 0007);
        boolean isLoggedIn = false;

        // Login process with 3 attempts
        for (int attempt = 1; attempt <= 3; attempt++) {
            System.out.print("Enter your PIN: ");
            int pin = sc.nextInt();
            if (app.isVerify(pin)) {
                isLoggedIn = true;
                System.out.println("Welcome " + app.getAccountHoderName());
                break;
            } else {
                System.out.println("Invalid PIN. You have " + (3 - attempt) + " attempt(s) left.");
            }
        }

        if (!isLoggedIn) {
            System.out.println(app.getAccountHoderName() + ", your login attempts are over. Exiting.");
            return; // Exit the program if login fails
        }

        int ch;
        double amount;

        do {
            System.out.println("\n========== Banking Menu ==========");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Hello " + app.getAccountHoderName() + ", your balance is: ₹" + app.getBalance());
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    amount = sc.nextDouble();
                    app.deposit(amount);
                    break;
                case 3:
                    System.out.print("Enter withdraw amount: ");
                    amount = sc.nextDouble();
                    app.withdraw(amount);
                    break;
                case 4:
                    System.out.println("Thank you for using our services!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select between 1-4.");
            }
        } while (ch != 4);

        sc.close();
    }
}
