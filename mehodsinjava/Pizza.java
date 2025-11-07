package mehodsinjava;

import java.util.Scanner;

public class Pizza {

	public Pizza() {
		System.out.println("you order simple pizza");
	}
	public Pizza(String para1) {
		System.out.println("you order italian pizza");
	}
	public Pizza(String para1,String para2) {
		System.out.println("you order "+ para1 + "pizza with " + para2);
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first parameter");
		String para1=sc.nextLine();
		System.out.println("enter second parameter");
		String para2=sc.nextLine();
		ConstructorForPizza pizza=new ConstructorForPizza(para1,para2);
	}


}
