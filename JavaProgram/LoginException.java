package JavaProgram;

import java.util.Scanner;

public class LoginException 
{
	public static void checkDetails(String name,String password) throws InvalidLogin{
		if(name.equalsIgnoreCase("Sushant Shinde") && password.equalsIgnoreCase("admin123")) {
			System.out.println("Welcome To SS Communication");
		}
		else {
			throw new InvalidLogin("Caught Exception: Invalid name or password");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your name");
		String name=sc.nextLine();
		System.out.println("Enter Your Password");
		String password=sc.nextLine();
		try {
			checkDetails(name,password);
		}
		catch(InvalidLogin e) {
			System.out.println(e.getMessage());
		}

	}

}
class InvalidLogin extends Exception
{
	public InvalidLogin(String message) {
		super(message);
	}
}
