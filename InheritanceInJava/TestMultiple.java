package InheritanceInJava;

import java.util.Scanner;

public class TestMultiple {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name: ");
		String name=sc.nextLine();
		System.out.println("enter your account number: ");
		String accountNumber=sc.nextLine();
		MultipleInheritanceInJava m=new MultipleInheritanceInJava(name, accountNumber, 10000);
		int ch = 0;
		while(ch!=5) {
			System.out.println("enter your choice: ");
			ch=sc.nextInt();
			sc.nextLine();
			double amount;
			switch (ch) {
			case 1:
				m.showBalance();
				break;
			case 2:
				System.out.println("enter the amount: ");
				amount=sc.nextDouble();
				m.withdraw(amount);
				break;
			case 3:
				System.out.println("enter the amount: ");
				amount=sc.nextDouble();
				m.deposit(amount);
				break;
			case 4:
				System.out.println("Thank you for visiting");
				break;
			default:
				System.out.println("Invalid");
			}
			
		}

	}

}
