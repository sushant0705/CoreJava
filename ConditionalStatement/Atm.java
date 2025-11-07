package ConditionalStatement;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int pin;
        double amount;
        boolean isValid=false;
        do {
        	
        	System.out.println("enter your pin: ");
        	pin=sc.nextInt();
        	
        	System.out.println("enter amount");
        	amount=sc.nextDouble();
        	if(amount>0 && amount<10000) {
        		System.out.println("amount is valid transaction is processing");
        		isValid=true;
        	}
        	else {
        		System.out.println("invalid amount");
        	}
        }while(!isValid);

	}

}
