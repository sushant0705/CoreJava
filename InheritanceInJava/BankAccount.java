package InheritanceInJava;


public class BankAccount {
	private String accountHolderName;
	double balance;
	int pin;

	public BankAccount(String name, double initialBalance, int pin) {
		this.accountHolderName = name;
		this.balance = initialBalance;
		this.pin = pin;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public boolean verifyPin(int enteredPin) {
		return this.pin == enteredPin;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("$" + amount + " deposited successfully");
		} else {
			System.out.println("Invalid deposit amount");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("$" + amount + " withdrawn successfully");
		} else {
			System.out.println("Insufficient balance");
		}
	}
}


class SavingAccount extends BankAccount {
	String accountType;
	public SavingAccount(String name, double initialBalance, int pin,String accountType) {
		super(name, initialBalance, pin);
		this.accountType=accountType;
	}
	public String getAccount() {
		return accountType;
	}
}