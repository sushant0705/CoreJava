package InheritanceInJava;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		SavingAccount account = new SavingAccount("Sushant", 1000.0, 1234,"saving");
		
		System.out.println("===== Welcome to Secure ATM App =====");

		int attempts = 0;
		boolean loggedIn = false;

		while (attempts < 3) {
			System.out.print("Enter your 4-digit pin: ");
			int enteredPin = sc.nextInt();

			if (account.verifyPin(enteredPin)) {
				loggedIn = true;
				System.out.println("Login successful, Welcome " + account.getAccountHolderName());
				break;
			} else {
				attempts++;
				System.out.println("Incorrect pin. Attempts left: " + (3 - attempts));
			}
		}

		if (!loggedIn) {
			System.out.println("Account locked due to 3 incorrect attempts.");
			sc.close();
			return;
		}

		int choice;
		double amount;

		do {
			System.out.println("\n=== ATM Menu ===");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Account Type");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
				case 1:
					System.out.println("Current Balance is $" + account.getBalance());
					break;
				case 2:
					System.out.print("Enter amount to deposit: ");
					amount = sc.nextDouble();
					account.deposit(amount);
					break;
				case 3:
					System.out.print("Enter amount to withdraw: ");
					amount = sc.nextDouble();
					account.withdraw(amount);
					break;
				case 4:
					System.out.println(account.getAccountHolderName()+"you account is"+account.accountType);
					break;
				case 5:
					System.out.println("Thank you for using the ATM.");
					break;
				default:
					System.out.println("Invalid choice. Please try again.");
			}

		} while (choice != 5);

		sc.close();
	}
}