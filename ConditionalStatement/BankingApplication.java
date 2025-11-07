package ConditionalStatement;

public class BankingApplication
{
	private String accountHoderName;
	double balance;
	int pin;
	public BankingApplication(String name,double intialBalance,int pin) {
		this.accountHoderName=name;
		this.balance=intialBalance;
		this.pin=pin;
	}
	public String getAccountHoderName() {
		return accountHoderName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public boolean isVerify(int enteredpin) {
		return this.pin==enteredpin;
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance=balance+amount;
			System.out.println(amount+"successfully deposit you account ");
		}
		else {
			System.out.println("invalid");
		}
	}
	
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance ) {
			balance=balance+amount;
			System.out.println(amount+"successfully withdraw");
		}
		else {
			System.out.println("invalid");
		}
	}
	
}
