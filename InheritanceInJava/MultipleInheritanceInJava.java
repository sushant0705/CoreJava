package InheritanceInJava;
interface Atm
{
	void showBalance();
	void withdraw(double amount);
	void deposit(double amount);
}
public class MultipleInheritanceInJava implements Atm
{
	private String name;
	private String accountNumber;
	private double balance;
	
	
	
	public MultipleInheritanceInJava(String name, String accountNumber, double balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}


	@Override
	public void showBalance() {
		System.out.println(name+" your balace is "+balance);
		
	}

	@Override
	public void withdraw(double amount) {
		if(amount<=balance) {
			System.out.println(amount+"successfully withdraw from "+accountNumber);
			balance=balance-amount;
			System.out.println(name+" your current balance is "+balance);
		}
		else {
			System.out.println("Invalid Amount");
		}
		
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		if(amount>0) {
			System.out.println(amount+"successfully deposit in "+accountNumber);
			balance=balance+amount;
			System.out.println(name+" your current balance is "+balance);
		}
		else {
			System.out.println("Invalid Amount");
		}
		
	}
	

}
