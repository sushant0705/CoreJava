package JavaProgram;

import java.util.Scanner;

public class UdfException {
	public static void checkDetails(int age,String name) throws InvalidAge {
		if(age<18) {
			throw new InvalidAge ("Exception Caught: Invalid Age For The Driving "+name);
		}else {
			System.out.println(name+" Eligible To Drive");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your name: ");
		String name=sc.nextLine();
		System.out.println("Enter Your Age: ");
		int age=sc.nextInt();
		try {
			checkDetails(age,name);
		}
		catch(InvalidAge e){
			System.out.println(e.getMessage());
		}
	}

}
