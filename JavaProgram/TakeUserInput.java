package JavaProgram;
import java.util.*;

public class TakeUserInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int accountNumber;
		int pin;
		int withdrawAmount;
		boolean accountBalanceIsCorrect=false;
		boolean pinCorrect=false;
		System.out.println("enter the account Number");
		accountNumber=sc.nextInt();
		
		for(int attempt=1;attempt<=3;attempt++) {

			System.out.println("enter the account Pin");
			pin=sc.nextInt();
			if(accountNumber==12345 && pin==1234) {
				
				pinCorrect=true;
			}else {
				System.out.println("you have left  " + attempt + "attempt");
			}
			
		
		}
		if(pinCorrect==true) {
			do {
				System.out.println("enter the withdraw amount");
				withdrawAmount=sc.nextInt();
				if(withdrawAmount>0) {
					System.out.println("successfully withdraw amount");
					accountBalanceIsCorrect=true;
				}else {
					System.out.println("invalide amount");
				}
			}while(!accountBalanceIsCorrect);
		}else {
			System.out.println("your are block beacause multiple time wrong pin");
		}

	}

}
