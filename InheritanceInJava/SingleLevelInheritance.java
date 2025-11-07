//Create a program where a Bank class has a method to show the bank's name, 
//and an Account class inherits from Bank to show account type.
package InheritanceInJava;

import java.util.Scanner;

public class SingleLevelInheritance {
	String bankName;
	String accountNumber;
	
	
	 public SingleLevelInheritance(String bankName, String accountNumber) {
		this.bankName = bankName;
		this.accountNumber = accountNumber;
	}


	void Showdetails() {
		System.out.println("Bank Name: "+bankName);
		System.out.println("Account Number: "+accountNumber);
	}
}
class Account extends SingleLevelInheritance{
	String accountType;
	
	public Account(String bankName, String accountNumber, String accountType) {
		super(bankName, accountNumber);
		this.accountType = accountType;
	}
	void accountType() {
		System.out.println("Account Type: "+accountType);
	}
	
}


