package InheritanceInJava;

import java.util.Scanner;

public class TestSingle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("bank name");
		String bankName=sc.nextLine();
		System.out.println("account number");
		String accountNumber=sc.nextLine();
		System.out.println("accountType");
		String accountType=sc.nextLine();
		Account ac=new Account(bankName, accountNumber, accountType);
		ac.Showdetails();
		ac.accountType();
		
	}

}
