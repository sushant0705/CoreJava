package SwitchPrograms;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int result;
		System.out.println("enter first number: ");
		int fno=sc.nextInt();
		System.out.println("enter second number: ");
		int sno=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the operator");
		String operator=sc.nextLine();
		switch(operator) {
		case "+":
			result=fno+sno;
			System.out.println("the sum is"+result);
			break;
		case "-":
			result=fno+sno;
			System.out.println("the sub is"+result);
			break;
		case "*":
			result=fno+sno;
			System.out.println("the mul is"+result);
			break;
		case "/":
			result=fno+sno;
			System.out.println("the div is"+result);
			break;
		default:
			System.out.println("invalid operator");
		
		}
		
		
		// TODO Auto-generated method stub
//		Q1. Calculator using switch
//		Input: 10, 5, '+'
//		Expected Output: 15

	}

}
