package ConditionalStatement;
import java.util.*;

public class LoanApproval {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your country: ");
		String country=sc.nextLine();
		System.out.println("enter your age: ");
		int age=sc.nextInt();
		System.out.println("enter your salary: ");
		float salary=sc.nextFloat();
		System.out.println("enter your credit score: ");
		int creditScore=sc.nextInt();
		
		if(country.equalsIgnoreCase("India")) {
			if(age>=21) {
				if(salary>=300000) {
					if(creditScore>=700) {
						System.out.println("loan is approved");
						
					}else {
						System.out.println("you are not eligible for loan beacause your credit score is less than 700");
					}
				}else {
					System.out.println("you are not eligible for loan beacause you are salary is less than 3 lakhs");
				}
				
			}else {
				System.out.println("you are not eligible for loan beacause you are not valid age");
			}
		}
		else {
			System.out.println("you are not eligible for loan beacause you are not indian");
		}
		}

}
